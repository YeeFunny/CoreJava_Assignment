package com.java.week2.multithread;

import java.io.IOException;
import java.time.LocalDateTime;

public class Question3 {
	public static void main(String[] args) {
		DaemonThread t = new DaemonThread();
		t.setDaemon(true);
		t.start();
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class DaemonThread extends Thread {

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(1000);
				System.out.println(LocalDateTime.now());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}