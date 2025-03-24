package com.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeList {
	public static void main(String[] args) {
		Employee e1 = new Employee(200, "Raj", 35000);
		Employee e2 = new Employee(100, "Atharv", 95000);
		Employee e3 = new Employee(400, "Siddharth", 55000);
		Employee e4 = new Employee(300, "Vishnu", 85000);
		
		//Java 9 added of method to add multiple elements in a Collection
		// Java 8 allow you to add static methods inside the interface
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1); list.add(e2); list.add(e3);	list.add(e4);
		display(list);
		Collections.sort(list, (x, y) -> Integer.compare(x.getId(), y.getId()));
		display(list);
		// Double.compare(x, y)
		Collections.sort(list, (x, y) -> Double.compare(x.getSalary(), y.getSalary()));
		display(list);
		
	}
	public static void display(List<Employee> list) {
		for(Employee e : list) {
			System.out.println(e);
		}
		System.out.println("--------------------------------");
	}
}
