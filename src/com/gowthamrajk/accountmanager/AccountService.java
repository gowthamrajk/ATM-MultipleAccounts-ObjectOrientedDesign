package com.gowthamrajk.accountmanager;

import java.util.List;
import java.util.ArrayList;

public class AccountService {
	
	private List<Account> accountList = new ArrayList<>();
	private AccountRepository accountRepository = new AccountRepository();
	
	public List<Account> getAccounts() {
		return accountList;
	}

	public void setAccounts(List<Account> accountList) {
		this.accountList = accountList;
	}
	
	public void getAccountList() {
		this.accountList = accountRepository.getStateBankAccounts();
	}
	
	public void addNewAccount(Account account) {
		accountRepository.addNewStateBankAccount(account);
	}

	public double checkBalance(int accountNumber) {
		
		getAccountList();
		for(Account accountObj : accountList) {
    		
    		if(accountObj.getAccountNumber() == accountNumber) {
    			return accountObj.getActiveBalance();
    		}
    	}
		return 0;
	}
	
	public boolean depositAmount(int accountNumber, double depositAmount) {
		
		getAccountList();
		if(depositAmount <= 0) {
			System.out.println("Enter Valid Amount !!!");
		}
		else {			
			for(Account accountObj : accountList) {
	    		
	    		if(accountObj.getAccountNumber() == accountNumber) {
	    			accountObj.setActiveBalance(accountObj.getActiveBalance() + depositAmount);
	    			return true;
	    		}
	    	}
		}
		return false;
	}
	
	public boolean withdrawAmount(int accountNumber, double withdrawalAmount) {
		
		getAccountList();
		if(withdrawalAmount <= 0) {
			System.out.println("Enter Valid Amount !!!");
    	}
		else {
			for(Account accountObj : accountList) {
	    		
	    		if(accountObj.getAccountNumber() == accountNumber && accountObj.getActiveBalance() > withdrawalAmount) {
	    			
	    			accountObj.setActiveBalance(accountObj.getActiveBalance() - withdrawalAmount);    			
	    			return true;
	    		}
	    	}
			
		}
		return false;
	}
	
	public void transferFund(int sourceAccountNumber, int destinationAccountNumber, double transferAmount) {
		
		getAccountList();
        for(Account accountObj : accountList) {
    		
    		if(accountObj.getAccountNumber() == sourceAccountNumber) 
    			withdrawAmount(sourceAccountNumber, transferAmount);
    		else if(accountObj.getAccountNumber() == destinationAccountNumber) 
    			depositAmount(destinationAccountNumber, transferAmount);
    	}
		System.out.println("\nAmount of Rs: " + transferAmount + " INR successfully tranfered from the account No " 
                + sourceAccountNumber + " to the account No " + destinationAccountNumber + "\n");
	}
	
	public void displayAllAccount() {
		
		getAccountList();
		for(Account accountObj : accountList) {
			
			System.out.println(accountObj);
		}
	}
	
	public Account searchAccount(int accountNumber) {
		
		getAccountList();
        for(Account accountObj : accountList) {
			
			if(accountObj.getAccountNumber() == accountNumber) {
				return accountObj;
			}
		}
        return null;
	}
	
    public Account searchAccount(String customerName) {
		
		getAccountList();
        for(Account accountObj : accountList) {
			
			if(accountObj.getCustomerName().equalsIgnoreCase(customerName)) {
				return accountObj;
			}
		}
		return null;
	}
    
    public Account searchAccount(long mobile) {
		
		getAccountList();
        for(Account accountObj : accountList) {
			
			if(accountObj.getMobile() == mobile) {
				return accountObj;
			}
		}
        return null;
	}
    
    public Account updateAccount(int accountNumber, String customerName, String address, long mobile, String email) {
    	
    	getAccountList();
        for(Account accountObj : accountList) {
			
			if(accountObj.getAccountNumber() == accountNumber) {
				accountObj.setCustomerName(customerName);
				accountObj.setAddress(address);
				accountObj.setMobile(mobile);
				accountObj.setEmail(email);
				System.out.println("\nAccount Details Updated Successfully !!!\n");
				return accountObj;
			}
		}
        return null;
    }
    
    public void deleteAccount(int accountNumber) {
    	
    	getAccountList();
        for(Account accountObj : accountList) {
			
			if(accountObj.getAccountNumber() == accountNumber) {
				accountRepository.deleteStateBankAccount(accountObj);
				System.out.println("\nAccount with no : " + accountNumber + " deleted Successfully !!!\n");
				break;
			}
		}
    }
}