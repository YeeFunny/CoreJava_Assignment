package com.java.week2.multithread;

public class Deadlock {
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();

	/**
	 * Deadlock is the situation when two or more threads are waiting for each other
	 * to release the resource they need (lock) and get stuck for infinite time.
	 * 
	 * We can avoid deadlock by requesting an ordered access of locks.
	 */

	public void method1() {
		synchronized (lock1) {
			System.out.println("Aquired lock on lock1.");

			synchronized (lock2) {
				System.out.println("Aquired lock on lock2.");
			}
		}
	}

	public void method2() {
		synchronized (lock1) {
			System.out.println("Aquired lock on lock1.");

			synchronized (lock2) {
				System.out.println("Aquired lock on lock2.");
			}
		}
	}
}
