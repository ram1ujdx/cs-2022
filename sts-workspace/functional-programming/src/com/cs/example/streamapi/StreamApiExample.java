package com.cs.example.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiExample {
	
	
	
//	static List<Integer> getEvens(List<Integer> list){
//		
//		List<Integer> evens = new ArrayList<>();
//		for(int num:list) {
//			if(num%2==0) {
//				evens.add(num);
//			}
//		}
//		return evens;
//	}
//	
//	static List<Integer> getMultiplied(List<Integer> list){
//		List<Integer> newList = new ArrayList<>();
//		for(int num:list) {
//				num*=2;
//				newList.add(num);
//			
//		}
//		return newList;
//	}
//	
//	static int getSum(List<Integer> list){
//		int sum=0;
//		for(int num:list) {
//			sum+=num;
//		}
//		return sum;
//	}

	public static void main(String[] args) {
		
		// Consider a list of numbers
		
		List<Integer> nums = Arrays.asList(1,2,5,8,7,6);
		
		// Find all the even numbers
		
//		List<Integer> evens = getEvens(nums);
//		
//		// Multiply all the numbers by 2
//		List<Integer> mulList = getMultiplied(evens);
//		
//		// Return the sum
//		
//		int result = getSum(mulList);
//		
//		System.out.println(result);
		
		// Stream<Integer> numStreams = Stream.of(10,2,5,3,7,6);
		
		int result2 = nums.parallelStream().filter(n->n%2==0)
						.mapToInt(n->n*2)
						.findFirst()
						.getAsInt();
						
						//.orElseThrow(()->new ArithmeticException("No value passed the filter conditions"));
		
		// Optional
		
		System.out.println(result2);
		
		
		
		
		
		
		
	}

}
