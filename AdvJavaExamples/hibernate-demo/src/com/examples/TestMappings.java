package com.examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestMappings {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure(); // configure("filename.xml");
		// Connection Factory from the Configuration
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		State state = session.get(State.class, "MH");
		System.out.println("State id = "+state.getStateId());
		System.out.println("State name = "+state.getStateName());
		state.getCities().forEach(city -> System.out.println(city));
		
		session.close();
		factory.close();
	}
}
