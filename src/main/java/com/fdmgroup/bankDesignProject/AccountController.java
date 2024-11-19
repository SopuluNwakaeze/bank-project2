package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public class AccountController {
	private List<Customer> customers = new ArrayList<>();
	private List<Account> accounts = new ArrayList<>();

	public Customer createCustomer(String name, String address, String type) {
		if (type.equals("person")) {
			Customer person = new Person(name, address);
			customers.add(person);
			return person;
		}
		if (type.equals("company")) {
			Customer company = new Company(name, address);
			customers.add(company);
			return company;
		}
		return null;

	}

	public Account createAccount(Customer customer, String type) {
		if (type.equals("checking")) {
			CheckingAccount checkAccount = new CheckingAccount();
			accounts.add(checkAccount);
			customer.getAccounts().add(checkAccount);
			return checkAccount;
		}
		if (type.equals("savings")) {
			SavingsAccount saveAccount = new SavingsAccount();
			accounts.add(saveAccount);
			customer.getAccounts().add(saveAccount);
			return saveAccount;
		}

		return null;
	}

	public void removeCustomer(Customer customer) {
		customers.remove(customer);
		accounts.removeAll(customer.getAccounts());
	}

	public void removeAccount(Account account) {
		getAccounts().remove(account);

		for (int i = 0; i < getCustomers().size(); i++) {
			getCustomers().get(i).removeAccount(account);
		}
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

}
