package com.java.week2.collection;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Question8 {
	public static void main(String[] args) {

		Collection<String> srcstr = new ArrayList<String>();

		srcstr.add("New York");
		srcstr.add("Atlanta");
		srcstr.add("Dallas");
		srcstr.add("Madison");
		System.out.println("Number of elements: " + srcstr.size());
		srcstr.forEach(s -> System.out.println(s));
		Collection<String> deststr = new ArrayList<String>();
		deststr.add("Delhi");
		deststr.add("Mumbai");
		Collections.copy((ArrayList)srcstr, (ArrayList)deststr);
		deststr.forEach(s -> System.out.println(s));
	
		User u1 = new User("John");
		User u2 = new User("Paul");
		User u3 = new User("Anna");
 		List<User> users = new ArrayList<User>(Arrays.asList(u1, u2, u3));
 		Collections.sort(users);
		users.forEach(s -> System.out.println(s.getName()));
	}
}

class User implements Comparable<User> {
	private String name;

	public String getName() {
		return name;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(User user) {
		Locale local = new Locale("pl", "PL");
		return Collator.getInstance(local).compare(this.name, user.getName());
	}
}

