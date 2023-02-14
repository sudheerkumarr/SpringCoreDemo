package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.Address;
import com.example.entity.Login;
import com.example.entity.Student;

public class MyApp {

	public static void main(String[] args) {

		// Create Spring Container
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get Student obj from container
		Student std1 = context.getBean("student", Student.class) ;// beanId(lowerCamelCase class name), class name
		System.out.println(std1);
		
		std1.setRollNo(1001);
		std1.setAge(15);
		std1.setName("Bob");
		//List<String> cNos= Arrays.asList("9999911111", "9999922222", "9999933333");
		
		List<String> cNos=new ArrayList<>();
		cNos.add("9999911111");
		cNos.add("9999922222");
		cNos.add("9999933333");
		
		std1.setContactNos(cNos);
		
		System.out.println(std1);
		
		
		//Address addr = context.getBean("address", Address.class);
		
		// custome bean id
		Address addr = context.getBean("myAddress", Address.class);
		System.out.println(addr);
		
		
		// Get login obj from container
		Login login = context.getBean("login", Login.class);
		System.out.println(login);// 
		login.setEmail("s1@example.com");
		login.setPassword("abc.123");
		
		std1.setLogin(login);
		System.out.println(std1);
		
		HashMap<String, Integer> marks = new HashMap<>();
		marks.put("English", 80);
		marks.put("Science", 85);
		marks.put("Maths", 99);
		marks.put("Computers", 70);
		
		std1.setMarks(marks);
		
		System.out.println(std1);
		System.out.println(std1.getContactNos());
		System.out.println(std1.getContactNos().get(0));
		System.out.println(std1.getMarks().get("English"));
		
		// Scope - singleton, prototype
		// singleton(default) - same object will be return for all requests
		// prototype - new object created for every request
		
		Address addr3 = context.getBean("myAddress", Address.class);
		Address addr4 = context.getBean("myAddress", Address.class);
		
		// Singleton - same object will return for every request
		System.out.println(addr3==addr4); // true
		System.out.println(addr3.hashCode()); // 79290965
		System.out.println(addr4.hashCode()); // 79290965
		
		// Prototype - new object created for every request
		System.out.println(addr3==addr4); // false
		System.out.println(addr3.hashCode()); // 1909546776
		System.out.println(addr4.hashCode()); // 392781299
		
		// xml
		// <bean id="std1" class="com.example.entity.Student" scope="prototype">
		
		
		
		
	}

}
