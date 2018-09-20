package com.java.lab2;

public class Lab2_5_1 {
	private String firstName;
	private String lastName;
	private int number;
	private char gender;
	
	// Default constructor
	public Lab2_5_1() {
		super();
	}
	
	// Parameterized constructor
	public Lab2_5_1(String firstName, String lastName, int number, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		if (gender == 'M' || gender == 'F')
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		if (gender == 'M' || gender == 'F')
			this.gender = gender;
		else
			System.out.println("Gender input is invalid!");
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
