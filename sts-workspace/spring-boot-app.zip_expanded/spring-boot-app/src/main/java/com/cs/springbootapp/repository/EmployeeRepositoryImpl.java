package com.cs.springbootapp.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cs.springbootapp.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	private Map<Integer, Employee> employeeDb=new HashMap<>();
	
	public Employee saveEmployee(Employee employee) {
		employeeDb.put(employee.getId(), employee);
		return employee;
	}

	public Employee getEmployee(int id) {
		return employeeDb.get(id);
	}

	public boolean deleteEmployee(int id) {
		employeeDb.remove(id);
		return !employeeDb.containsKey(id);
	}

	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = new ArrayList<>(employeeDb.values());
		return employeeList;
	}

}
