package com.java.week2.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Question4 {
	
	static boolean checkNullKey(Map map) {
		if (map == null || map.size() == 0) {
			return false;
		}
		
		Iterator iter = map.keySet().iterator();
		while(iter.hasNext()) {
			if (iter.next() == null) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		map1.put(null, 1);
		System.out.println(checkNullKey(map1));
		
		TreeMap map2 = new TreeMap();
		System.out.println(checkNullKey(map2));
	}
}
