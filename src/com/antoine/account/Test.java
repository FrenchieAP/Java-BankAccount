package com.antoine.account;

public class Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Account testAccount = new Account();
		Account antoineAccount = new Account(600.50, 15000.00);
		Account bobAccount = new Account(35.72, 5000.00);
		antoineAccount.depositChecking(1);
		antoineAccount.depositSavings(1);
		antoineAccount.withdrawChecking(2);
		antoineAccount.withdrawSavings(2);
		System.out.println(antoineAccount.getAllFunds());
		System.out.println(antoineAccount.getMyFunds());
		antoineAccount.withdrawChecking(999999);
		antoineAccount.withdrawSavings(999999);
    }
}
		