package com.gowthamrajk.accountmanager;

public class CitibankAccount extends Account {

	public CitibankAccount(int accountNumber, String customerName, double activeBalance, String address, long mobile,
			String email) {
		
		super(accountNumber, customerName, activeBalance, address, mobile, email, "Citi Bank");
		System.out.println("\nYour Citi Bank Account created successfully !!!");
		
	}

}
