package com.java.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "John");
		Employee e2 = new Employee(2, "Paul");
		Employee e3 = new Employee(3, "David");
		
		List<Employee> a = new ArrayList<Employee>(Arrays.asList(e1, e2, e3));
		a = Collections.unmodifiableList(a);
		
		for (Employee e : a) {
			System.out.println("Id: " + e.getId() + "; Name: " + e.getName());
		}
	}
}

final class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}