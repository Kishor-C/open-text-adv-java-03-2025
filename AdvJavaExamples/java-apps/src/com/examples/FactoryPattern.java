package com.examples;

public class FactoryPattern {
	public static DBLogics getDao() {
		return new DAO2();
	}
}
