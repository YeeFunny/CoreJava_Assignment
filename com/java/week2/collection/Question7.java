package com.java.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question7 {
	public static void main(String[] args) {
		MyString str1 = new MyString("**united**abc");
		MyString str2 = new MyString("**united**abcd");
		MyString str3 = new MyString("abcd**united**");
		MyString str4 = new MyString("**united**abcde");
		MyString str5 = new MyString("asdasdad**united**");
		MyString str6 = new MyString("**united**a");
		List<MyString> list = new ArrayList<MyString>(Arrays.asList(str1, str2, str3, str4, str5, str6));
		Collections.sort(list, new MyComparator());
		list.forEach(s -> System.out.println(s.name));
	}
}

class MyComparator implements Comparator<MyString> {

	@Override
	public int compare(MyString o1, MyString o2) {
		int index1 = o1.name.toLowerCase().indexOf("united");
		int index2 = o2.name.toLowerCase().indexOf("united");
		int len1 = o1.name.length();
		int len2 = o2.name.length();
		if (index1 == index2) {
			return len1 >= len2 ? (len1 == len2 ? 0 : 1) : -1;
		} else if (index1 < index2) {
			return -1;
		} else {
			return 1;
		}
	}
}

class MyString {

	String name;

	public MyString(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
