package com.java.lab4;

public class CurrentAccount extends Account{

	private final double overdraft = -500.0;

	@Override
	public boolean withdrow(double amount) {
		double newBalance = getBalance() - amount;
		if (newBalance > overdraft) {
			setBalance(newBalance);
			return true;
		}
		return false;
	}
}
