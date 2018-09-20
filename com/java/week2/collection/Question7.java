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
		// TODO Auto-generated method stub
		if (o1.name.toLowerCase().charAt(0) == o2.name.toLowerCase().charAt(0)) {
			if (o1.name.length() < o2.name.length())
				return -1;
			else if (o1.name.length() > o2.name.length())
				return 1;
			return 0;
		} else if (o1.name.toLowerCase().startsWith("*")) {
			return -1;
		} else if (o2.name.toLowerCase().startsWith("*")) {
			return 1;
		} else {
			return 0;
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
