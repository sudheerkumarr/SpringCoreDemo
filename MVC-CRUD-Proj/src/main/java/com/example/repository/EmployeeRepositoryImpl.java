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

	@Transactional
	public Employee addEmployee(Employee emp) {
		// Get current hibernate session
		Session currentSession = sessionFactory.getCurrentSessionn();
		// Save employee
		currentSession.saveOrUpdate(emp);
	}

	public Employee getEmployeeById(int empId) {

		// Get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Retrieve/Read from database using the primary key
		Employee emp = currentSession.get(Employee.class, empId);
		
		return emp;
	}

	
	public List<Employee> getAllEmployees() {
		// get the current hibernate session
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Employee", Employee.class);
		List<Employee> empList = query.getResultList();
		return empList;
	}

	public void deleteEmployeeById(int empId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query query = currentSession.createQuery("delete from Employee where id=:eId");
		theQuery.setParameter("eId", empId);
		
		query.executeUpdate();
	}

}
