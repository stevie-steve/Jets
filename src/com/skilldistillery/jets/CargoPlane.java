package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane() {

	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("I fly slow.");
		System.out.println();
	}

	public void load() {
		System.out.println(this.getModel() + " is here for cargo. ");
		System.out.println("Load me up!");
		System.out.println();
	}

	@Override
	public double speedInMach(double speed, double range) {
		return super.speedInMach(speed, range);
	}

	public CargoPlane(String type, String model, double speed, int range, double price) {
		super(type, model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

}
