package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeService implements EmployeeServiceIF{

	@Override
	public Employee setEmloyee(String name, String designation, long salary) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(name, salary, designation);
		return employee;
	}

	@Override
	public void getScheme(Employee employee) {
		// TODO Auto-generated method stub
		char scheme = '\u0000';
		long salary = employee.getSalary();
		if (employee.getDesignation().equals("System Associate") && salary >= 5000 && salary < 20000)
			scheme = 'C';
		if (employee.getDesignation().equals("Programmer") && salary >= 20000 && salary < 40000)
			scheme = 'B';
		if (employee.getDesignation().equals("Manager") && salary >= 40000)
			scheme = 'A';
		employee.setInsuranceScheme(scheme);
	}

	@Override
	public void display(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Employee details:");
		System.out.println("-----------------");
		System.out.println("Id: " + employee.getId());
		System.out.println("Name: " + employee.getName());
		System.out.println("Designation: " + employee.getDesignation());
		System.out.println("Salary: " + employee.getSalary());
		System.out.println("Insurance Scheme: " + employee.getInsuranceScheme());
	}
}
