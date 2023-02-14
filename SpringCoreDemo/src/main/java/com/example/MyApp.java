package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.example.bean.Login;
import com.example.bean.Student;

/*
Container -
  Instantiate, configure and assemble dependencies b/w objects
Types of containers:  
 BeanFactory(I)  - org.springframework.beans.factory.BeanFactory
   XmlBeanFactory(C)
   ex:
     Resource resource=new ClassPathResource("applicationContext.xml");  
     BeanFactory factory=new XmlBeanFactory(resource);
 ApplicationContext(I) - org.springframework.context.ApplicationContext
    ClassPathXmlApplicationContext(C)
    ex:
      ApplicationContext context =   
         new ClassPathXmlApplicationContext("applicationContext.xml");  
Dependency Injection - 
  design pattern
  Removes the dependency from programming code.
  Makes programming code loosely coupled and easier for testing.
 * Ways to perform DI
 * 1. Constructor Injection - primitive, String, Objects, Collection values
 *   <constructor-arg>
 * 2. Setter Injection
 *   <property>
 
 * Step 1 - Add dependencies
 * - Spring core jar files
   org.springframework.core-3.0.1.RELEASE-A
   com.springsource.org.apache.commons.logging-1.1.1
   org.springframework.beans-3.0.1.RELEASE-A
OR
--
- Spring core Dependencies
    // https://mvnrepository.com/artifact/org.springframework/spring-core
    implementation group: 'org.springframework', name: 'spring-core', version: '5.3.20'
	
    // https://mvnrepository.com/artifact/org.springframework/spring-context
    implementation group: 'org.springframework', name: 'spring-context', version: '5.3.20'
 * Step 2:
 *  Create applicationContext.xml in src/main/resource
 *  
 *  
 *  Ways to configure beans
 *   1. XML Based configuration
 *   2. AnnotationBased Configuration
 *   3. Java Based configurations - No XML
 *   
 *   
 */

public class MyApp {

	public static void main(String[] args) {
		//Login login = new Login("user1@example.com", "abc.123");
		//Student std = new Student(1001, "Ram", 15, login);
		
		// send request to service to persist student obj in db

//		// Step 1 - Create xml config file
//		// Step 2 - Using XML file, create spring container
//		 Resource resource=new ClassPathResource("applicationContext.xml");  
//	     
//		 // Way 1-  create bean factory using xml file
//		 BeanFactory factory=new XmlBeanFactory(resource);
//		
//		// Step 3 - get bean from container
//		Student s1 =(Student) factory.getBean("std1");
//		System.out.println(s1.getName());
//		System.out.println(s1);
//		
//		
//		Student s2 =(Student) factory.getBean("std2");
//		System.out.println(s2.getName());
//		System.out.println(s2);
//		
//		System.out.println();
//		System.out.println();
		// Way 2- Creating container using ApplicationContext
		ApplicationContext context =   
		         new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		// Get student obj from container
//		Student s3 = (Student) context.getBean("std1"); // std1 - bean id
//		System.out.println(s3);
//		
//		System.out.println();
//		System.out.println();
//		// Student obj with login
//		Student s4 = (Student)context.getBean("std3");
//		System.out.println(s4);
//		Student s5 = (Student)context.getBean("std4");
//		System.out.println(s5);
//		
//		// update properties of an object
//		s5.setAge(17);
//		System.out.println(s5.getAge());
		
		// Setter Injection
		// Get obj from container
		Student s1 = (Student) context.getBean("std1");
		System.out.println(s1);
		
		
		// 
		ApplicationContext context2 =   
		         new ClassPathXmlApplicationContext("applicationContextConstructor-arg.xml");
		Student s6= (Student)context2.getBean("std4");
		System.out.println(s6);
		
	}

}
