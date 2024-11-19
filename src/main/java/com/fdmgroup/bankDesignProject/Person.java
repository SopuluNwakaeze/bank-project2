package com.fdmgroup.bankDesignProject;

public class Person extends Customer {

	public Person(String name, String address) {
		super(name, address);
	}

	@Override
	public void chargeAllAccounts(double amount) {
		for (int i = 0; i < getAccounts().size(); i++) {
			getAccounts().get(i).withdraw(amount);
		}
	}
}
