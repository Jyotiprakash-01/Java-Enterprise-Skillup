package com.creational_patterns;

public class Logger{
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

