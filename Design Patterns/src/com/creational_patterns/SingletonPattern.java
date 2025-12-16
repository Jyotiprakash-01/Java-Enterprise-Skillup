package com.creational_patterns;

//Logger pattern is an example of creational pattern

public class SingletonPattern {
	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		logger.log("Hi");
		logger.log("The program has started");
//		logger.log(null);
	}
	//implement thread safety operations for logger
	
	
	
}
