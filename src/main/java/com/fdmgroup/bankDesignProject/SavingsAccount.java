package com.fdmgroup.bankDesignProject;

public class SavingsAccount extends Account {
	private double interestRate;

	public void addInterest() {
		correctBalance(getBalance() + getBalance() * (interestRate / 100.00));
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double withdraw(double amount) {
		if (amount > getBalance()) {
			return 0;
		} else {
			correctBalance(getBalance() - amount);
			return amount;
		}
	}

}
