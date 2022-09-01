package com.cs.example.lambdas;


interface Printable{
	void print(String str);
}

class Calculator{
	int calculate(int x, int y, MathOperation op) {
		return op.operate(x, y);
	}
}

interface MathOperation{
	int operate(int x, int y);
}

//class Printer implements Printable{
//	
//	public void print() {
//		System.out.println("Hello World");
//	}
//}


public class LambdaExpression {

	public static void main(String[] args) {
		
		
		Calculator calc = new Calculator();
		
		int resultMul = calc.calculate(10, 15, (x,y)->x*y);
		int resultAdd = calc.calculate(10, 15, (x,y)->x+y);
		
		System.out.println(resultMul);
		
		
//		Printable p = new Printable() {
//			public void print() {
//				System.out.println("Hello World");
//			}
//		};
		
//		Printable p = str -> {
//			System.out.println(str);
//		};
//		
//		
//		p.print("Hey.. How are you?");
	}

}
