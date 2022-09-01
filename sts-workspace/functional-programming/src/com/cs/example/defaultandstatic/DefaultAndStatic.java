package com.cs.example.defaultandstatic;

interface Scannable{
	
	void scan();
	
	static void sayHello() {
		System.out.println("Hello Guys..");
	}
	
	default void fun() {
		System.out.println("Have Fun");
	}
}

class MyScanner implements Scannable{
	
	public void scan() {
		System.out.println("Scanning Documents..");
	}
	
	public void fun() {
		System.out.println("Fun with Scanner");
	}
	
}

public class DefaultAndStatic {

	public static void main(String[] args) {
		
//		Scannable scanner = ()->System.out.println("Hey Scanner");
		
		Scannable scanner = new MyScanner();
		
		scanner.scan();
		scanner.fun();
		
		Scannable.sayHello();
		
	}
	
}
