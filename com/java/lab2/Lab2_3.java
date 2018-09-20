package com.java.lab2;

public class Lab2_3 {
	
	private String firstName;
	private String lastName;
	private char gender;
	
	// Default constructor
	public Lab2_3() {
		super();
	}
	
	// Parameterized constructor
	public Lab2_3(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
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
		this.gender = gender;
	}
	
}
