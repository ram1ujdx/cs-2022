package com.cs.example.filereading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadingWithNIO {

	public static void main(String[] args) {
		
		try {
			Files.lines(Paths.get("resources/hello.txt")).forEach(line->System.out.println(line));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
