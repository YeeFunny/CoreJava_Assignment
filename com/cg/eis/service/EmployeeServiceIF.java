package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeServiceIF {
	public Employee setEmloyee(String name, String designation, long salary);
	public void getScheme(Employee employee);
	public void display(Employee employee);
}
