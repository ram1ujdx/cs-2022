package com.cs.employeeapp.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cs.employeeapp.exception.EmployeeNotFoundException;
import com.cs.employeeapp.exception.ErrorResponse;

@RestControllerAdvice
public class EmployeeErrorController {

	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ErrorResponse handleEmployeeNotFoundException(Exception ex,
												HttpServletRequest req) {
		return new ErrorResponse(LocalDateTime.now(), 
				HttpStatus.NOT_FOUND.value(), 
				HttpStatus.NOT_FOUND.getReasonPhrase(), 
				ex.getMessage(), 
				req.getRequestURI());
	}
	
	// DuplicateEmployeeException
	// When you are trying add two employees with same id
	
	
	
}
