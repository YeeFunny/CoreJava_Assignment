package com.java.lab2;

public class Lab2_5_2 {
	private String firstName;
	private String lastName;
	private int number;
	private Gender gender;
	
	// Default constructor
	public Lab2_5_2() {
		super();
	}
	
	// Parameterized constructor
	public Lab2_5_2(String firstName, String lastName, int number, Gender gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.gender = gender;
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void printDetails() {
		System.out.println("Person Details:");
		System.out.println("---------------");
		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Number: " + this.number);
		System.out.println("Gender: " + this.gender);
	}
}

enum Gender {
	M, F
};
