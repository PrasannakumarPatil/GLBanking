package com.greatlearning.model;

public class Customer {

	private String password;
	private int acc_number;
	private int balance=1000;
	
	public Customer(String password, int acc_number) {
		super();
		this.password = password;
		this.acc_number = acc_number;
		
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAcc_number() {
		return acc_number;
	}
	
	public void setAcc_number(int acc_number) {
		this.acc_number = acc_number;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance)
	{
		this.balance = balance;
	}
}
