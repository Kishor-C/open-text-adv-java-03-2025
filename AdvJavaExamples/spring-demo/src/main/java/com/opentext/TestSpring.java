package com.opentext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		
		// Once you create ApplicationContext spring automatically creates all the singleton object
		// apart from the singleton object it also creates prototype object - opposite of single
		// spring container will have all the objects configured in the xml file
		
		/* just run this program to see the output - if constructor has S.o.p it will be printed
		 We have not created UserService object but we are seeing constructor output because spring 
		 created the object*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		/* By default spring creates singleton object & getBean returns the same object */
		UserService service = (UserService)context.getBean("userService"); 
		System.out.println(service.getRandomValues());
		
		UserService service2 = (UserService)context.getBean("userService"); 
		System.out.println(service2.getRandomValues());
		
		System.out.println("DONE...");
	}
}
