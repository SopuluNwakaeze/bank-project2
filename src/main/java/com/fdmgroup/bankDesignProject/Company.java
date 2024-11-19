package com.fdmgroup.bankDesignProject;

public class Company extends Customer {

	public Company(String name, String address) {
		super(name, address);
	}

	@Override
	public void chargeAllAccounts(double amount) {
		for (int i = 0; i < getAccounts().size(); i++) {
			if (getAccounts().get(i) instanceof CheckingAccount) {
				getAccounts().get(i).withdraw(amount);
			} else {
				getAccounts().get(i).withdraw(amount * 2);
			}
		}

	}

}
