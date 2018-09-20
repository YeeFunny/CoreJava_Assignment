package com.java.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question6 {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "Anna");
		Employee e2 = new Employee(2, "Ann");
		Employee e3 = new Employee(3, "Joy");
		Employee e4 = new Employee(4, "Walter");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		Iterator<Employee> iter = list.iterator();
		while (iter.hasNext()) {
			Employee e = iter.next();
			if (e.getName().startsWith("A")) {
				iter.remove();
			}
		}
		for (Employee e : list) {
			System.out.println("Id: " + e.getId() + "; Name: " + e.getName());
		}

		List<String> strings = new ArrayList<String>(Arrays.asList("A", "B", "C"));
		for (String s : strings) {
			if (s == "B") {
				strings.remove("B");
				break;
			}
		}
		System.out.println(strings);
	}
}
