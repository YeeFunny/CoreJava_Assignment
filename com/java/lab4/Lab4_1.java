package com.java.lab4;

public class Lab4_1 {
	public static void main(String[] args) {
		Person smith = new Person("Smith");
		Person kathy = new Person("Kathy");
		
		Account smith_acc = new Account();
		smith_acc.setAccHolder(smith);
		smith_acc.setBalance(2000);
		Account kathy_acc = new Account();
		kathy_acc.setAccHolder(kathy);
		kathy_acc.setBalance(3000);
		
		smith_acc.deposit(2000);
		kathy_acc.withdrow(2000);
		
		System.out.println("Balance of Smith's account: " + smith_acc.getBalance());
		System.out.println("Balance of Kathy's account: " + kathy_acc.getBalance());
	}
}
