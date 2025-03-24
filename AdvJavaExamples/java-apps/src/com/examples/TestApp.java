package com.examples;

import java.util.Scanner;

/*
 * 
 * Control + to increase the font-size
 * main - control + space
 * sysout - control + space
 * Scanner - java.util.Scanner
 *  - nextInt(), nextDouble(), next(), nextLine()
 */
public class TestApp {	
	public static void main(String[] args) {
		System.out.println("Hello Everyone!");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.next();
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		System.out.println("Hello "+name+", your age = "+age);
		
		scanner.close();
	}
}
