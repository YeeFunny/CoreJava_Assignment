package com.java.week2.collection;

import java.util.ArrayList;

public class Question3 {

	static ArrayList<String> addComma(ArrayList<String> list) {
		ArrayList<String> newList = new ArrayList<String>();
		if (list != null) {
			for (String str : list) {
				str = str.replaceAll(" ", " ,");
				newList.add(str);
			}
		}
		return newList;
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("cat mat bat");
		list.add("rat sat bat");
		list.add("wat fat got");
		list = addComma(list);
		System.out.println(list);
	}
}
