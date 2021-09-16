package com.gowthamrajk.accountmanager;

public class IndianbankAccount extends Account {

	public IndianbankAccount(int accountNumber, String customerName, double activeBalance, String address, long mobile,
			String email) {
		
		super(accountNumber, customerName, activeBalance, address, mobile, email, "Indian Bank");
		System.out.println("\nYour Indian Bank Account created successfully !!!");

	}
	
}
