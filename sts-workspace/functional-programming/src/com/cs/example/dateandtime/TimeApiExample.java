package com.cs.example.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeApiExample {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2020, 10, 25);
		LocalDate currentDate = LocalDate.now();
		
		boolean output = date.isBefore(currentDate);
		System.out.println(output);
		
		
//		
////		System.out.println(date);
////		System.out.println(currentDate);
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter a date[dd-MM-yyyy] : ");
//		String dateString = scan.nextLine();
//				
//		LocalDate date2 = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//		
//		System.out.println("Entered Date : "+date2);
		
		
//		LocalTime time = LocalTime.now();
//		
//		System.out.println(time);
		
//		LocalDateTime dateTime = LocalDateTime.now();
//		
//		System.out.println(dateTime);
		
		
		
		// yyyy-MM-dd
		
	}

}
