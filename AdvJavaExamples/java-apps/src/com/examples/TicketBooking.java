package com.examples;

public class TicketBooking implements Runnable {

	private static int counter = 1;
	
	@Override
	public synchronized void run() {
		String name = Thread.currentThread().getName();
		if(counter > 0) {
			System.out.println("Congrats! "+name+" you got the ticket");
			counter--;
		} else {
			System.out.println("Sorry! "+name+" ticket is unavailable");
		}
	}
	
	public static void main(String[] args) {
		TicketBooking ticket = new TicketBooking();
		Thread thread1 = new Thread(ticket, "Siddharth"); // this gives thread name
		Thread thread2 = new Thread(ticket, "Atharv"); // this gives thread name
		Thread thread3 = new Thread(ticket, "Vishnu"); // this gives thread name
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
