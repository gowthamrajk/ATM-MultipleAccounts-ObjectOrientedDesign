package com.gowthamrajk.accountmanager;

public class StatebankService implements ATM {
	
	private String invalidErrorMessage  = "Enter Valid Amount !!!";
	private String insufficientErrorMessage = "Insufficient Fund !!!";
	
	@Override
	public double checkBalance(Account account) {

    	return account.getActiveBalance();
	}

	@Override
	public boolean depositAmount(Account account, double depositAmount) throws InvalidAmountException {

		if(depositAmount <= 0) {
			throw new InvalidAmountException(invalidErrorMessage);
		}
		else {			
			account.setActiveBalance(account.getActiveBalance() + depositAmount);
	        return true;
		}
	}

	@Override
	public boolean withdrawAmount(Account account, double withdrawalAmount) throws InvalidAmountException, InsufficientAmountException {

		if(withdrawalAmount <= 0) {
			throw new InvalidAmountException(invalidErrorMessage);
    	}
		else {
	    	if(account.getActiveBalance() > withdrawalAmount) {
	    			
	    		account.setActiveBalance(account.getActiveBalance() - withdrawalAmount);    			
	    		return true;
	    	}
	    	else
	    		throw new InsufficientAmountException(insufficientErrorMessage);
		}
	}

	@Override
	public void transferFund(Account account1, Account account2, double transferAmount) throws InvalidAmountException, InsufficientAmountException  {
		
		if(transferAmount <= 0) 
			throw new InvalidAmountException(invalidErrorMessage);
		else if(account1.getActiveBalance() < transferAmount) 
			throw new InsufficientAmountException(insufficientErrorMessage);
		else {
			account1.setActiveBalance(account1.getActiveBalance() - transferAmount); 
			account2.setActiveBalance(account2.getActiveBalance() + transferAmount);
		}
		System.out.println("\nAmount of Rs: " + transferAmount + " INR successfully tranfered from the " + account1.getBankName() 
		                   + " account No " + account1.getAccountNumber() + " to the " +  account2.getBankName()  
		                   + " account No " + account2.getAccountNumber() + "\n");		
	}

	@Override
	public void displayAccount(Account account) {

			System.out.println(account);
	}

	@Override
	public Account updateAccount(Account account, String customerName, String address, long mobile, String email) {

		account.setCustomerName(customerName);
		account.setAddress(address);
		account.setMobile(mobile);
		account.setEmail(email);
		System.out.println("\nAccount Details Updated Successfully in your StateBank Account!!!\n");
		return account;
	}
}
