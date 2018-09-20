package com.java.week2.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Question1 {

	static int getNumOfElements() {
		int numOfElements = 0;
		System.out.println("Please indicate the number of elements: ");
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
			String noOfElements = reader.readLine();
			numOfElements = Integer.parseInt(noOfElements);
		} catch (NumberFormatException e1) {
			System.out.println("Invalid input value.");
			getNumOfElements();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		return numOfElements;
	}

	static HashMap<String, LinkedList<Integer>> inputElement(HashMap<String, LinkedList<Integer>> map) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("Please enter the key: ");
			String key = reader.readLine();
			System.out.println("Please enter the value");
			Integer value = Integer.parseInt(reader.readLine());
			map = concatenateMap(key, value, map);
		} catch (NumberFormatException e1) {
			System.out.println("Invalid input value.");
			inputElement(map);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		return map;
	}

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
