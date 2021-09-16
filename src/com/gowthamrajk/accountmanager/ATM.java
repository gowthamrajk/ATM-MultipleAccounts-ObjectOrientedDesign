package com.gowthamrajk.accountmanager;

public interface ATM {
	
	double checkBalance(Account account);
	
	boolean depositAmount(Account account, double depositAmount) throws InvalidAmountException;
	
	boolean withdrawAmount(Account account, double withdrawalAmount) throws InvalidAmountException, InsufficientAmountException;
	
	void transferFund(Account account1, Account account2, double transferAmount) throws InvalidAmountException, InsufficientAmountException ;
	
	void displayAccount(Account account);
	
	Account updateAccount(Account account, String customerName, String address, long mobile, String email);
	
}
