package com.cs.employeeapp.repository;

import javax.persistence.Transient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cs.employeeapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public Employee findByEmployeeName(String employeeName);
	
//	@Query(value = "from Employee where employeeName=:employeeName")
//	public Employee searchByName(String employeeName);
	
//	@Query(value = "select * from employee_db where employee_name=:employeeName", nativeQuery = true)
//	public Employee searchByName(String employeeName);

}
