package com.cs.app.mymvnapp;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = 
    			new AnnotationConfigApplicationContext(BeanConfig.class);
    	
//    	Scanner scan = context.getBean("inputScanner",Scanner.class);
//    	
//    	String song = scan.nextLine();
    	
    	Phone phone = context.getBean(Phone.class);
    	
    	
       phone.playMusic("Hello");
    }
}
