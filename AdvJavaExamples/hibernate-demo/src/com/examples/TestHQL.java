package com.examples;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class TestHQL {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure(); // configure("filename.xml");
		// Connection Factory from the Configuration
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Query<Users> query = session.createQuery("from Users u where u.name=?1", Users.class);
		query.setParameter(1, "Atharv");
		// to get all the results you can call below getResultList
		List<Users> list = query.getResultList();
		
		list.forEach(u -> System.out.println(u));
		
		session.close();
		factory.close();
	}
}
