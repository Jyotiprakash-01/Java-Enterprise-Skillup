package com.creational_patterns;

/**
 * Limitations:
 * Violation of Open closed Principle: suppose a new type of vehicle is added then we have to modify the factory method of factory class. Similar to a Drive Through and Burger Analogy(neetcode)
 * Scalability Issues: As no of product types increase and their dependencies increase the simple factory method can become large and complex. managing a lot of those dependencies with a single class is difficult and makes debugging/ testing a lot more difficult. 
 * Tight Coupling.
 * Redundancy in modern frameworks: modern frameworks use DI that manage object creation and dependencies more effectively. 
 * 
 * Alternatives:
 * 	Factory Method Pattern
 * 	Abstract Factory Pattern
 * 	Dependencies Injection
 * 
 */
interface Vehicle{
	void start();
}

class MotorCar implements Vehicle{
	Logger logger = Logger.getInstance();
	@Override
	public void start() {
		logger.log("Started Moter Car");
	}
}
class Bike implements Vehicle{
	Logger logger = Logger.getInstance();
	@Override
	public void start() {
		logger.log("Started bike");
	}
}
class VehicleFactory{
	public Vehicle createVehicle(String vehicle) {
		if(vehicle==null || vehicle.trim().isEmpty()) throw new IllegalArgumentException("Vehicle can't be null or empty");
		
		if(vehicle.equals("car")) return new MotorCar();
		
		if(vehicle.equals("bike")) return new Bike();
		
		throw new IllegalArgumentException("Invalid Channel"+vehicle);
	}
}
public class FactoryPattern {
	public static void main(String[] args) {
		VehicleFactory factory= new VehicleFactory();
		
		Vehicle v1 = factory.createVehicle("car");
		Vehicle v2 = factory.createVehicle("bike");
		
		v1.start();
		v2.start();
	}
	
	
	
	
}
// In enterprise systems like spring boot factory pattern is heavily used but is often hidden behind //
// Dependency Injection insted of writing factory.createSomething() you define yours beans and the spring container 
// which acts as a giant sophisticated factory injects correct implementation for you at runtime.
// Explore abstract factory pattern.