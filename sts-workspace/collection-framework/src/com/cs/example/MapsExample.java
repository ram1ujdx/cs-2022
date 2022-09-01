package com.cs.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapsExample {

	public static void main(String[] args) {
		
		Map<Integer, Employee> employees = new HashMap<>();
		
		Employee emp1 = new Employee(1003, "Harsh", 54000);
		Employee emp2 = new Employee(1004, "Mohit", 61000);
		Employee emp3 = new Employee(1002, "Suraj", 45000);
		Employee emp4 = new Employee(1001, "Javed", 48000);
		Employee emp5 = new Employee(1005, "Navin", 62500);
		
		employees.put(emp1.getId(), emp1);
		employees.put(emp2.getId(), emp2);
		employees.put(emp3.getId(), emp3);
		employees.put(emp4.getId(), emp4);
		employees.put(emp5.getId(), emp5);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter an id to search for : ");
//		int employeeId = scan.nextInt();
//		Employee emp = employees.get(employeeId);
//		
//		System.out.println(emp);
		
		Set<Integer> keys = employees.keySet();
		
		for(int id:keys) {
			System.out.println(employees.get(id));
		}
		
		
	}
	
}
