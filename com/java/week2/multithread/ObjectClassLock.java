package com.java.week2.multithread;

public class ObjectClassLock {
	/*
	 * Object level lock is mechanism used to synchronize a non-static method or non-static code block 
	 * such that only one thread will be able to execute the code block on given instance of the class. 
	 * This should always be done to make instance level data thread safe.
	 * 
	 * Class level lock prevents multiple threads to enter in synchronized block in any of all available 
	 * instances of the class on runtime.
	 * 
	 * Instead of using Object level lock, when we want to use lock at static fields or methods. We
	 * should use Class level lock.
	 */
	//Method is static
    public synchronized static void demoMethod(){
 
    }
    
    public static void main(String[] args) {
		new Thread(() -> ObjectClassLock.demoMethod()).start();
	}
}
