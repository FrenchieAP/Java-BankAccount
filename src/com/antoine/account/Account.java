package com.antoine.account;

public class Account {
	
	// MEMBER VARIABLES
    private double checking;
    private double savings;
    
    // CLASS VARIABLE
    @SuppressWarnings("unused")
	private static int allAccounts = 0;
    private static double allFunds = 0.00;
    		
    // CONSTRUCTORS
    public Account () {
    	this.checking = 0.00;
    	this.savings = 0.00;
    }
    
	public Account(double checking, double savings) {
		this.checking = checking;
		this.savings = savings;
		allAccounts++;
		allFunds += this.checking + this.savings;
	}

	// GETTERS/SETTERS/ETC
	
	public double getAllFunds() {
		return allFunds;
	}
	
	public double getMyFunds() {
		return this.checking + this.savings;
	}
	
	public double getChecking() {
		return checking;
	}

	public void setChecking(double checking) {
		this.checking = checking;
	}

	public double getSavings() {
		return savings;
	}

	public void setSavings(double savings) {
		this.savings = savings;
	}
	
	public void depositChecking(int amount) {
		
		this.checking += amount;
		System.out.println(amount + " has been deposited. You now have " + this.checking + " in your checking account");
	}
	
	public void depositSavings(int amount) {
		
		this.savings += amount;
		System.out.println(amount + " has been deposited. You now have " + this.savings + " in your savings account");
	}
	
	public void withdrawChecking(int amount) {
		if (amount < this.checking) { 
		this.checking -= amount;
		System.out.println(amount + " has been withdrawn. You now have " + this.checking + " in your checking account");
		} else {
			System.out.println("Your funds are insufficient.");
		}
	}
	
	public void withdrawSavings(int amount) {
		if (amount < this.savings) { 
		this.savings -= amount;
		System.out.println(amount + " has been withdrawn. You now have " + this.savings + " in your savings account");
		} else {
			System.out.println("Your funds are insufficient.");
		}
	}
}