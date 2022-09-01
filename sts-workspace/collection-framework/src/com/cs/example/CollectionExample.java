package com.cs.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample {

	public static void main(String[] args) {
		
//		Collection items = new ArrayList();
		
		Set<String> items = new TreeSet<>();
		
		items.add("Ananya");
		items.add("Harsh");
		items.add("Vinay");
		items.add("Gaurav");
		items.add("Sushma");
		
		
//		System.out.println(items);
//		
//		System.out.println(items.get(3));
		
		
		// Iterator
		
//		Iterator itr = items.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
		// Index based
		
		int count = items.size();
//		for(int i=0; i<count; i++) {
//			System.out.println(items.get(i));
//		}
		
		// Enhanced for loop
		
		for(String item:items) {
			System.out.println(item.toUpperCase());
		}
		
		// forEach()
		
		//items.forEach(System.out::println);
		
		
		
		
		
		
		
	}
	
}
