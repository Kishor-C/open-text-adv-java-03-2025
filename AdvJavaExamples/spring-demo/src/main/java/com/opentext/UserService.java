package com.opentext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // an object of id userService will be created
public class UserService {
	
	// we need to use the interface reference to create a loosely coupled code
	
	@Autowired // injects the UserDao but there must be only one implementation in the container
	private UserDao dao;
	
	// setter method / constructor is required for spring to supply the object of UserDao
	
	public UserService() {
		System.out.println("User Service Object Created");
	}
	
	public String getRandomValues() {
		dao.save(); // if object is injected it will call the save method
		return "Random = "+Math.random();
	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
}

/*
	Scenario1 :
		UserService service = new UserService();
	Scenario2 : 
		UserService service = FactoryPattern();
	Scenario3 : 
		Spring Framework -> UserService() - Singleton object
		get that object anywhere in the application

*/