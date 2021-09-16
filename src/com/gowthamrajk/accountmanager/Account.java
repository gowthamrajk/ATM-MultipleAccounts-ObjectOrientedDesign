package com.gowthamrajk.accountmanager;

public class Account {
	
	private int accountNumber;
	private String customerName;
	private double activeBalance;
	private String address;
	private long mobile;
	private String email;
	private String bankName;
	
	public Account(int accountNumber, String customerName, double activeBalance, String address, long mobile, String email, String bankName) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.activeBalance = activeBalance;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.bankName = bankName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public double getActiveBalance() {
		return activeBalance;
	}
	
	public void setActiveBalance(double activeBalance) {
		this.activeBalance = activeBalance;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		
		return "\nAccount Details => accountNumber : " + accountNumber + ", customerName : " + customerName 
				+ ", activeBalance : " + activeBalance + ", Mobile : " + mobile + ", Email : " + email 
				+", address : " + address + ", Bank Name : " + bankName + "\n";
	}
}
