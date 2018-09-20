package com.java.lab3;

import java.util.Calendar;
import java.util.Date;

public class Person {
	private String firstName;
	private String lastName;
	private char gender;
	
	// Default constructor
	public Person() {
		super();
	}
	
	// Parameterized constructor
	public Person(String firstName, String lastName, char gender) {
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
	
	public int calculateAge(Date birthDay) {
		Calendar cal = Calendar.getInstance();  
		if (cal.before(birthDay)) {
			System.out.println("The birthday is invalid!"); 
		}
		int yearNow = cal.get(Calendar.YEAR);
		int monthNow = cal.get(Calendar.MONTH);
		int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);  
        
		cal.setTime(birthDay);
		int yearBirth = cal.get(Calendar.YEAR);
		int monthBirth = cal.get(Calendar.MONTH);
		int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
		
		int age = yearNow - yearBirth;
		if (monthNow <= monthBirth) {
			if (monthNow == monthBirth) {
				if (dayOfMonthNow < dayOfMonthBirth) age--;
			}else{
				age--;
			}
		}
		return age;  
	}
	
	public String getFullName() {
		return this.firstName + this.lastName;
	}
}
