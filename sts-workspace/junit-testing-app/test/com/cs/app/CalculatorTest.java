package com.cs.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CalculatorTest {
	
	Calculator calc;
	
	@BeforeAll
	public static void startTest() {
		System.out.println("Test is being started..");
	}
	
	@BeforeEach
	public void initTest() {
		System.out.println("Test started..");
		calc = new Calculator();
	}
	
	@Test
//	@EnabledOnOs(value = OS.WINDOWS)
	public void testAdd() {
		assertEquals(30, calc.add(10, 20));
		assertEquals(-15,calc.add(-5, -10));
		assertEquals(25,calc.add(35, -10));
	}
	
	
	@Test
	public void testDivide() {
		assertEquals(5, calc.divide(10, 2));
		assertEquals(3,calc.divide(30, 10));
		assertEquals(3,calc.divide(35, 10));
		assertEquals(6,calc.divide(-30, -5));
		assertThrows(ArithmeticException.class, ()->calc.divide(10, 0));
	}

}
