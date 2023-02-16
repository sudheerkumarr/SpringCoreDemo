package com.example.repository;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Employee;

@Repository
public class EmployeeRepositoryImpl implements IEmployeeRepository {

	@Autowired
	private SessionFactory sessionFactory;

	public Employee addEmployee(Employee emp) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save the customer ... finally LOL
		currentSession.save(emp);
	}

	public Employee getEmployeeById(int empId) {

		return null;
	}

	@Transactional
	public List<Employee> getAllEmployees() {
		// get the current hibernate session
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Employee", Employee.class);
		List<Employee> empList = query.getResultList();
		return empList;
	}

	public Employee deleteEmployeeById(int empId) {

		return null;
	}

	public Employee updateEmployee(Employee emp) {

		return null;
	}

}
