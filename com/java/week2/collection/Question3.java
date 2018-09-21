package com.java.week2.collection;

import java.util.ArrayList;
import java.util.List;

public class Question3 {

	static List<String> addComma(List<String> list) {
		List<String> newList = new ArrayList<String>();
		if (list != null) {
			for (String str : list) {
				str = str.replaceAll(" ", " ,");
				newList.add(str);
			}
		}
		return newList;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("cat mat bat");
		list.add("rat sat bat");
		list.add("wat fat got");
		list = addComma(list);
		System.out.println(list);
	}
}
