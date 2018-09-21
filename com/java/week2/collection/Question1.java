package com.java.week2.collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Question1 {

	static HashMap<String, LinkedList<Integer>> concatenateMap(String key, Integer value,
			HashMap<String, LinkedList<Integer>> map) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		if (map.containsKey(key)) {
			list = (LinkedList<Integer>) map.get(key);
		}
		list.add(value);
		map.put(key, list);
		return map;
	}

	static void print(HashMap<String, LinkedList<Integer>> map) {
		for (HashMap.Entry<String, LinkedList<Integer>> entry : map.entrySet()) {
			String key = entry.getKey();
			LinkedList<Integer> values = entry.getValue();
			System.out.print(key + " ");
			System.out.println(values);
		}
	}

	public static void main(String[] args) {

		System.out.println("Please indicate the number of elements: ");
		Scanner scan = new Scanner(System.in);
		String number = scan.nextLine();
		int noOfElement = Integer.parseInt(number);
		HashMap<String, LinkedList<Integer>> map = new HashMap<String, LinkedList<Integer>>();
		for (int i = 0; i < noOfElement; i++) {
			System.out.println("Please enter the key: ");
			String key = scan.nextLine();
			System.out.println("Please enter the value");
			Integer value = Integer.parseInt(scan.nextLine());
			map = concatenateMap(key, value, map);
		}
		print(map);
	}

}
