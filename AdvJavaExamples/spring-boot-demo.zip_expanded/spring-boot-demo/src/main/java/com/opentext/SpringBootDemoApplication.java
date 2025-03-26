package com.opentext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * This does all the auto-configuration based on the library
 * you have in your classpath
 * Auto-configuration starts from the root package of your application
 * in this example: com.opentext
 * But you can use 
 * @ComponentScan(basePackage="com") now the root package is com
 */
@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
