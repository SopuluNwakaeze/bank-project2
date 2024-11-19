package com.fdmgroup.bankDesignProject;

public class Bank {

	public static void main(String[] args) {
		AccountController accountController = new AccountController();
		Customer sop = new Person("Sop", "234 Royal Birch");
		System.out.println(accountController.createAccount(sop, "savings"));
		System.out.println(accountController.getAccounts().get(0).getACCOUNT_ID());
	}

}
