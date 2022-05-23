package com.c1evaluation;

public class Car {
	String model = "Harrier";
	String companyName = "Tata";
	String Color = "Black";
	Engine engine = new Engine();
	void enableTurbo() {
		engine.hasTurbo = true;
	}
	
	void displayInfo() {
		System.out.println("Car Model : "+model);
		System.out.println("Car companyName : "+companyName);
		System.out.println("Car color : "+Color);
		System.out.println("Car RPM : "+engine.rmp);
		System.out.println("Car power : "+engine.Power);
		System.out.println("Car Engine Manufacture : "+engine.manufacturer);
		System.out.println("Car Has Turbo : "+engine.hasTurbo);
		
	}
	public static void main(String[] args) {
		Car c = new Car();
			c.enableTurbo();
			c.displayInfo();
	}
}


class Engine{
	int rmp = 10000;
	int Power = 110;
	String manufacturer = "Tata";
	Boolean hasTurbo = false;
}