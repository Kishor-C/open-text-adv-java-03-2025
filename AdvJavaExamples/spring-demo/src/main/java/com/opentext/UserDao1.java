package com.opentext;

import org.springframework.stereotype.Repository;

@Repository // it creates a bean object with an id userDao1 - class name but first letter in lowercase
public class UserDao1 implements UserDao{

	@Override
	public void save() {
		System.out.println("UserDao1 save() method");
	}

}
