package com.examples;

import java.time.LocalDate;

public class TestLocalDateTime {
	public static void main(String[] args) {
		// ISO - yyyy-MM-dd
		LocalDate today = LocalDate.now();
		System.out.println("Today = "+today);
		LocalDate dob = LocalDate.parse("2000-10-22");
		System.out.println("DOB = "+dob);
		LocalDate dob25 = dob.plusYears(25);
		System.out.println("DOB after 25 years = "+dob25);
	}
}
