package com.gowthamrajk.accountmanager;

import java.util.List;
import java.util.ArrayList;

public class AccountRepository {
	
	private List<Account> stateBankAccounts = new ArrayList<>();
	private List<Account> indianBankAccounts = new ArrayList<>();
	private List<Account> cityBankAccounts = new ArrayList<>();

	public List<Account> getStateBankAccounts() {
		return stateBankAccounts;
	}
	
	public void addNewStateBankAccount(Account account) {
		this.stateBankAccounts.add(account);
	}
	
	public void deleteStateBankAccount(Account account) {
		stateBankAccounts.remove(account);
	}
	
	public List<Account> getIndianBankAccounts() {
		return indianBankAccounts;
	}
	
	public void addNewIndianBankAccount(Account account) {
		this.indianBankAccounts.add(account);
	}
	
	public void deleteIndianBankAccount(Account account) {
		indianBankAccounts.remove(account);
	}
	
	public List<Account> getCityBankAccounts() {
		return cityBankAccounts;
	}
	
	public void addNewCityBankAccount(Account account) {
		this.cityBankAccounts.add(account);
	}
	
	public void deleteCityBankAccount(Account account) {
		cityBankAccounts.remove(account);
	}
}
