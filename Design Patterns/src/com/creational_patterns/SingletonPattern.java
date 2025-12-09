package com.creational_patterns;

//Logger pattern is an example of creational pattern
class Logger{
	private static Logger logger=null;
	private Logger() {
		System.out.println("Logger Initialized");
	}
	public static Logger getInstance() {
		if(logger==null) {
			logger=new Logger();
		}
		return logger;
	}
	public void log(String message) {
		if(message == null) throw new NullPointerException();
		System.out.println("[LOG] : "+message);
	}
}
public class SingletonPattern {
	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		logger.log("Hi");
		logger.log("The program has started");
//		logger.log(null);
	}
	
	
	
}
