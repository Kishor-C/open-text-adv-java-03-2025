package com.examples;

public class DAO2 implements DBLogics {

	DAO2() {
		System.out.println("DAO2 constructor");
	}
	
	@Override
	public void save() {
		System.out.println("DAO2 save() method");
	}

}
