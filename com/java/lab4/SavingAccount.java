package com.java.lab4;

public class SavingAccount extends Account{

	private final double miniBalance = 500.0;

	@Override
	public boolean withdrow(double amount) {
		// TODO Auto-generated method stub
		double left = getBalance() - amount;
		if (left >= miniBalance) {
			setBalance(left);
			return true;
		}
		return false;
	}
}
