package com.cs.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeCollections {

	public static void main(String[] args) {
		
		
		
		Employee emp1 = new Employee(1003, "Harsh", 54000);
		Employee emp2 = new Employee(1004, "Mohit", 61000);
		Employee emp3 = new Employee(1002, "Suraj", 45000);
		Employee emp4 = new Employee(1001, "Javed", 48000);
		Employee emp5 = new Employee(1005, "Navin", 62500);
		
		
		
//		Comparator<Employee> sortById = (e1,e2)->  e1.getId()-e2.getId();
		
		Set<Employee> employeeList = new TreeSet<>((e1,e2)-> {
				// statements
				return e1.getId()-e2.getId();
		});
		
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter an id to search for : ");
//		int employeeId = scan.nextInt();
//		Employee emp = null;
		
		for(Employee e:employeeList) {
			System.out.println(e);
		}
		
		
		
		
		
	}
	
}
