package com.cg.eis.bean;

public class Employee {
	private long id;
	private String name;
	private long salary;
	private String designation;
	private char insuranceScheme;
	private static long noOfEmployee;
	
	public Employee(String name, long salary, String designation) {
		this.id = ++noOfEmployee;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
		
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public char getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(char insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
}
