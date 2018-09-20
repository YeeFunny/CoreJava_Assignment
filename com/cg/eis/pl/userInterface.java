package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class userInterface {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input your name: ");
		String name = scan.nextLine();
		System.out.println("Please input your designation: ");
		String designation = scan.nextLine();
		System.out.println("Please input your salary: ");
		long salary = scan.nextLong();
		
		EmployeeService service = new EmployeeService();
		Employee employee = service.setEmloyee(name, designation, salary);
		service.getScheme(employee);
		service.display(employee);
	}
}
