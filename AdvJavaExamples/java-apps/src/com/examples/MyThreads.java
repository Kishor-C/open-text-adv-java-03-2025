package com.examples;

public class MyThreads implements Runnable {

	/*
	 * It is an entry point for a child thread 
	 */
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i = 1; i <= 100; i++) {
			System.out.println("i = "+i+", run() called by: "+name);
		}
	}

}
