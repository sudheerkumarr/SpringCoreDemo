package com.example.entity;

import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {

	// Fields/Variables
	private int rollNo;
	private String name;
	private int age;

	private List<String> contactNos;

	private HashMap<String, Integer> marks;

	// Has-A relationship
	@Autowired
	private Login login;
	
	@Autowired
	private Address addr;
	
	@Autowired
	//@Qualifier("rectangle")
	private Shape shape;
	

	// Constructors
	public Student() {
		super();
	}

	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	
	
	public Student(int rollNo, String name, int age, List<String> contactNos, Login login) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.contactNos = contactNos;
		this.login = login;
	}

	public Student(int rollNo, String name, int age, List<String> contactNos, HashMap<String, Integer> marks,
			Login login) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.contactNos = contactNos;
		this.marks = marks;
		this.login = login;
	}

	public Student(int rollNo, String name, int age, Login login) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.login = login;
	}

	// Getters & Setters
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Login getLogin() {
		return login;
	}

	
	public void setLogin(Login login) {
		this.login = login;
	}

	public List<String> getContactNos() {
		return contactNos;
	}

	public void setContactNos(List<String> contactNos) {
		this.contactNos = contactNos;
	}

	public HashMap<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(HashMap<String, Integer> marks) {
		this.marks = marks;
	}

	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	@PostConstruct
	public void init() {
		System.out.println("Inside init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method");
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", contactNos=" + contactNos
				+ ", marks=" + marks + ", login=" + login + ", addr=" + addr + ", shape=" + shape + "]";
	}


}
