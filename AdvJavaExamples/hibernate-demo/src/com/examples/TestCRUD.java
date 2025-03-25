package com.examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCRUD {
	public static void main(String[] args) {
		// all the classes & interfaces are imported from org.hibernate
		// Configuration to load the hibernate.cfg.xml
		Configuration configuration = new Configuration();
		configuration.configure(); // configure("filename.xml");
		// Connection Factory from the Configuration
		SessionFactory factory = configuration.buildSessionFactory();
		// Connection
		Session session = factory.openSession(); 
		// Transaction is required for insert, update & delete
		Transaction transaction = session.beginTransaction();
		//persist is used to save the object - it automatically executes insert query
		/*
		Users user = new Users();
		user.setName("Atharv");	user.setPhone(88773392393L); user.setEmail("a@g.com");
		session.persist(user); // execute insert query on users table
		System.out.println("User saved with an id : "+user.getUserId());
		transaction.commit();
		*/
		// get the user based on id using get() method
		Users u = session.get(Users.class, 101); // select query on primary key
		System.out.println(u);
		// update you can use 
		u.setEmail("aa@g"); // updates the email
		transaction.commit();
		// you can also remove by passing entity object that is retrieved based on id
		//session.remove(u);
		//closing the resources
		session.close();
		factory.close();
	}
}
