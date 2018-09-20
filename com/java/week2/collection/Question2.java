package com.java.week2.collection;

import java.util.Arrays;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "John");
		Employee e2 = new Employee(2, "Paul");
		Employee e3 = new Employee(3, "David");
		
		ImmutableList list = new ImmutableList(Arrays.asList(e1, e2, e3));
		List<Employee> l = list.getList();
		for (Employee e : l) {
			System.out.println("Id: " + e.getId() + "; Name: " + e.getName());
		}
	}
}

final class ImmutableList {
	private List<Employee> list;
	
	public ImmutableList(List<Employee> list) {
		this.list = list;
	}

	public List<Employee> getList() {
		return list;
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