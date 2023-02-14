package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.Address;
import com.example.entity.Login;
import com.example.entity.Student;

/*
 * @Component
 * @ComponentScan
 * @Scope
 * @Configuration
 * 
 * @PreDestroy
 * @PostConstruct
 * @Qualifier 
 * @ Primary
 * @Autowired - ref
 *   DI - types
 *   Constructor Injection
 *      - Call @Autowired annotation on construction
 *   Setter Injection
 *      - Call @Autowired annotation on setter methods
 *   Field Injection
 *      - Call @Autowired annotation on fields/variables
 * 
 * XML - ref
 */

public class MyApp {

	public static void main(String[] args) {

		// Create container
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Get required objects from container
		Student std =context.getBean("student", Student.class);
		Address addr= context.getBean("myAddress", Address.class);
		Login login = context.getBean("login", Login.class);
		
		System.out.println(std);
		System.out.println(addr);
		System.out.println(login);
		
		//java.lang.NullPointerException
		// Without @Autowired
		// System.out.println(std.getLogin()); // null
		// System.out.println(std.getLogin().getEmail()); // NullPointerException
		// System.out.println(std.getLogin().getPassword()); // NullPointerException
		
		// With @Autowired
		System.out.println(std.getLogin()); //Login [email=null, password=null]
		
	    System.out.println(std.getLogin().getEmail()); // null
		System.out.println(std.getLogin().getPassword()); // null
//		
		std.getShape().draw();
	}

}
