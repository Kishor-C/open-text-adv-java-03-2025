package com.examples;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class TestCriteria {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure(); // configure("filename.xml");
		// Connection Factory from the Configuration
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		//CriteriaBuilder
		CriteriaBuilder builder = session.getCriteriaBuilder();
		//Query to get list of Users
		CriteriaQuery<Users> usersCriteria = builder.createQuery(Users.class);
		//Specifying from which entity you need to query
		Root<Users> root = usersCriteria.from(Users.class);
		//get the list of users using session.createQuery(CriteriaQuery)
		List<Users> users = session.createQuery(usersCriteria).getResultList();
		users.forEach(x -> System.out.println(x));
		//Query to get only the names
		CriteriaQuery<String> namesCriteria = builder.createQuery(String.class);
		// select from Users entity
		Root<Users> root2 = namesCriteria.from(Users.class);
		namesCriteria.select(root2.get("email")); // select email property from Users
		// get the users between some id like 100 to 102
		namesCriteria.where(builder.between(root2.get("userId"), 100, 102));
		List<String> names =  session.createQuery(namesCriteria).getResultList();
		names.forEach(x -> System.out.println(x));
		session.close();
		factory.close();
		// for multiple properties you can use Object[] i.e., CriteriaQuery<Object[]> 
		// try to select name & email from the users entity and display all the data
	}
}
