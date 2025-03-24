package com.examples;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		// tightly coupled Code - Scenario 1
		DBLogics dao = new DAO2();
		dao.save();
		System.out.println("----------------------------------");
		// loosely coupled code - Scenario 2 - factory pattern
		DBLogics dao1 = FactoryPattern.getDao();
		dao1.save();
		System.out.println("----------------------------------");
		// loosely coupled code - Scenario 2 - factory pattern
		DBLogics dao2 = FactoryPattern.getDao();
		dao2.save();
	}
}
