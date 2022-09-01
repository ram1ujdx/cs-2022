package com.cs.example;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

	private int id;
	private String employeeName;
	private float salary;
	
	public Employee() {
	}
	
	

	public Employee(int id, String employeeName, float salary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.salary = salary;
	}


	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(employeeName, id, salary);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employeeName, other.employeeName) && id == other.id
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}
	
	@Override
	public int compareTo(Employee emp) {
		
		return (int)(this.salary-emp.salary);
		
	}
	
	
	
}
