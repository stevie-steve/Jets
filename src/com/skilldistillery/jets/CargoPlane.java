package com.skilldistillery.jets;

public class CargoPlane extends Jet { // Implements CargoCarrier{

	public CargoPlane() {

	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("i fly slow");
	}

	public void load() {

	}

	public void getMachSpeed() {

	}

	public CargoPlane(String type, String model, double speed, int range, double price) {
		super(type, model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

}
