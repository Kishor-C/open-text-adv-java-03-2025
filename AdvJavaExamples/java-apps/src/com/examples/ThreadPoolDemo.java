package com.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+" invokes run() method");
	}
	
}

public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3); // 3 threads will be avaiable in the pool
		// you will pass the runnable to the submit() method which uses the thread in pool to invoke run() 
		for(int i = 0; i < 10; i++) {
			executor.submit(new Task());
		}
	}
}
