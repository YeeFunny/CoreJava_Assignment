package com.java.lab4;

public class Account {
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	private static long noOfAcc;
	private long accNum;
	private double balance;
	private Person accHolder;
	
	public Account() {
		this.accNum = ++noOfAcc;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	// Have to change the return type to boolean, help child classes check balance
	public boolean withdrow(double amount) {
		double left = this.balance - amount;
		if (left >= 500.0) {
			this.balance = left;
			return true;
		}
		return false;
	}
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
