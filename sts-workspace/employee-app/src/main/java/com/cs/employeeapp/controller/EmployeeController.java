package com.cs.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cs.employeeapp.model.Employee;
import com.cs.employeeapp.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@PostMapping("/employees")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return service.addEmployee(employee);
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") int employeeId) {
		return service.getEmployeeById(employeeId);
	}
	
	@DeleteMapping("/employees/{id}")
	public boolean deleteEmployee(@PathVariable("id") int employeeId) {
		return service.deleteEmployee(employeeId);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
		
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	
	@GetMapping("/employees/name/{employeeName}")
	public Employee getEmployeeByName(@PathVariable String employeeName) {
		return service.searchEmployeeByName(employeeName);
	}
	
	
}
