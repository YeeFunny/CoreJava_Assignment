package com.java.lab2;

public class PersonMain {
	
	public static void main(String[] args) {
		Lab2_3 person = new Lab2_3("Yifang", "Liu", 'M');
		System.out.println("Person Details:");
		System.out.println("---------------");
		System.out.println("First Name: " + person.getFirstName());
		System.out.println("Last Name: " + person.getLastName());
		System.out.println("Gender: " + person.getGender());
	}
	
}
