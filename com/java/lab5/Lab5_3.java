package com.java.lab5;

import com.java.lab4.Person;

public abstract class Lab5_3 {
	private static long noOfAcc;
	private long accNum;
	private double balance;
	private Person accHolder;
	
	public Lab5_3() {
		this.accNum = ++noOfAcc;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	abstract void withdrow(double amount);
	
	public long getAccNum() {
		return accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
}
