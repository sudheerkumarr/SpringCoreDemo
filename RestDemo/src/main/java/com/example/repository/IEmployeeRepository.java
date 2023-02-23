package com.example.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	
//	// Get employee by name
//	Employee findByEmpName(String name);
//	// Find employees based on salary
//	List<Employee> findBySalary(double salary);
//	// Find employee by contactNo
//	Employee findByContactNo(String contactNo);
	
	// @Query
	// 1. JPQL - Java persistance query language
	// sql - select * from employee where name="raj";
	// jpql - select e from Employee e where e.name="raj";
	//      - select e from Employee e where e.name=?1;
	@Query("select e from Employee e where e.empName=?1")
	Employee findByEmpName(String name);
	
	// 2. native query
	// @Query(select e from Employee where e.salary between ?1 and ?2 ) - jpql
//	@Query(value="select * from employee where salary between ?1 and ?2", nativeQuery=true)
//	List<Employee> getEmployeesBySalary(double sal1, double sal2);
	
	// Named Parameters
	@Query(value="select * from employee where salary between :salary1 and :salary2", nativeQuery=true)
	List<Employee> getEmployeesBySalary(@Param("salary1") double sal1, @Param("salary2") double sal2);
	
	// Named Query

}
