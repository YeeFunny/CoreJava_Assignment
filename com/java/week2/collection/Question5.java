package com.java.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question5 {

	static List<String> removePrefixString(List<String> originList, List<String> removeList) {
		Iterator<String> iterOrigin = originList.iterator();
		while (iterOrigin.hasNext()) {
			String origin = iterOrigin.next().toString();
			Iterator<String> iterRemove = removeList.iterator();
			while (iterRemove.hasNext()) {
				if (origin.contains(iterRemove.next())) {
					iterOrigin.remove();
					break;
				}
			}
		}
		return originList;
	}

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>(Arrays.asList("Mango", "Banana", "Apple"));
		a = removePrefixString(a, new ArrayList<String>((Arrays.asList("Man", "Apple", "Bananana"))));
		System.out.println(a);
	}
}
