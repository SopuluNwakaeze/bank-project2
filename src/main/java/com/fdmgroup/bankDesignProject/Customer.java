package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
	private final long CUSTOMER_ID;
	private static long nextCustomerId = 2000000L;
	private String name;
	private String address;
	private List<Account> accounts = new ArrayList<Account>();

	public Customer(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		CUSTOMER_ID = nextCustomerId;
		nextCustomerId += 7;
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public void removeAccount(Account account) {
		accounts.remove(account);
	}

	public abstract void chargeAllAccounts(double amount);

	public long getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
