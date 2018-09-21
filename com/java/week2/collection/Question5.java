package com.java.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question5 {

	static List<String> removeString(List<String> originList, List<String> removeList) {
		List<String> result = new ArrayList<>(originList);
		Iterator<String> iterOrigin = result.iterator();
		while (iterOrigin.hasNext()) {
			String origin = iterOrigin.next().toString();
			Iterator<String> iterRemove = removeList.iterator();
			while (iterRemove.hasNext()) {
				String remove = iterRemove.next();
				if (origin.contains(remove) || remove.contains(origin)) {
					iterOrigin.remove();
					break;
				}	
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>(Arrays.asList("Mango", "Banana", "Apple", "A"));
		List<String> b = new ArrayList<String>(Arrays.asList("Man", "Apple", "Ma"));
		List<String> result1 = removeString(a, b);
		List<String> result2 = removeString(b, a);
		result1.addAll(result2);
		System.out.println(result1);
	}
}
