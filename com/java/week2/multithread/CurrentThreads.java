package com.java.week2.multithread;

import java.util.Iterator;
import java.util.Set;

public class CurrentThreads {
	public static void main(String[] args) {

		Set<Thread> threads = Thread.getAllStackTraces().keySet();
		Iterator<Thread> iter = threads.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().getName());
		}
	}
}
