package com.acme.financial;

public class BankAccount {
	private int number;
	private long balance;
	
	public BankAccount(int number, long initialBalance) {
		this.number = number;
		this.balance = initialBalance;
		
	}

	public int getAccountNumber() {
		return number;
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(long ant) {
		this.balance = this.balance + ant;
		
	}
	
}
