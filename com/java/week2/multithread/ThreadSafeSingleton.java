package com.java.week2.multithread;

public class ThreadSafeSingleton {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(() -> System.out.println(Singleton.getInstance().hashCode())).start();
		}
	}
}

class Singleton {

	private static Singleton instance;

	private Singleton() {};

	public static Singleton getInstance() {
		synchronized (ThreadSafeSingleton.class) {
			if (instance == null) {
				instance = new Singleton();
			}
			return instance;
		}
	}
}