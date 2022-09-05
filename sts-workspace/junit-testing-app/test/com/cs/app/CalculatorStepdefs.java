package com.cs.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepdefs {
	
	private Calculator calc;
	int result=0;
	
	@Given("^Input two numbers$")
	public void initTest() {
		calc = new Calculator();
	}
	
	
	@When("^I input numbers ([0-9]+) and ([0-9]+)$")
	public void invokeAdd(int a, int b) {
		result = calc.add(a, b);
	}
	
	@Then("^The result is ([0-9]+)$")
	public void testAdd(int output) {
		assertEquals(output,result);
	}

}
