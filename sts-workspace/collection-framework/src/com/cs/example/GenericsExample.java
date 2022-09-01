package com.cs.example;

class ValueFinder<T extends Number> {

	T value;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value=value;
	}
	
}

public class GenericsExample{
	public static void main(String[] args) {
		
		ValueFinder<Float> obj = new ValueFinder<>();
		
	}
}
