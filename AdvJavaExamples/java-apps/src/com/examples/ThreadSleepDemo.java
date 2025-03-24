package com.examples;
/*
 * How much time does this code takes to complete
 * when all the thread goes to the sleep state and comes to the runnable state
 * (a) 4 seconds or more
 * (b) less than 4 seconds
 */

class R implements Runnable {
	public void run() {
		String name = Thread.currentThread().getName();
		try {
			System.out.println(name+" going to sleep state");
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.err.println(e);
		}
		
		System.out.println(name+" comes back to runnable state");
	}
}
public class ThreadSleepDemo {
	public static void main(String[] args) {
		R r = new R();
		new Thread(r, "ONE").start();
		new Thread(r, "TWO").start();
		new Thread(r, "THREE").start();
		new Thread(r, "FOUR").start();
	}
}
