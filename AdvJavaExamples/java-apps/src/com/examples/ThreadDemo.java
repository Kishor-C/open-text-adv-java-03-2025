package com.examples;

public class ThreadDemo {
	public static void main(String[] args) {
		/* main thread will run the main method
		 * Thread class has static methods - currentThread()
		 * Thread class has methods like getName(), getId()...
		 * start(), setName(), isDaemon()
		 */
		System.out.println("main method starts");
		// currentThread returns the thread running this method
		Thread thread = Thread.currentThread();
		System.out.println("main() - Thread name: "+thread.getName());
		// you can create a Thread object from Thread class & pass runnable type to thread
		MyThreads runnable = new MyThreads(); // runnable type object that has run() method
		// creating Thread object
		Thread thread1 = new Thread(runnable); // just creates a thread object
		thread1.start(); // registers thread in the thread-schedular
		Thread thread2 = new Thread(runnable); // 2nd thread is still not registered
		thread2.start(); // registers 2nd thread in the schedular
		System.out.println("main method ends");
	}
}
