package com.gowthamrajk.accountmanager;

public class StatebankAccount extends Account {

	public StatebankAccount(int accountNumber, String customerName, double activeBalance, String address, 
			long mobile, String email) {
		
		super(accountNumber, customerName, activeBalance, address, mobile, email, "State bank");
		System.out.println("\nYour State Bank Account created successfully !!!");
		
	}
}