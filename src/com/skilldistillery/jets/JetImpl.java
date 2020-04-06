package com.skilldistillery.jets;

public class JetImpl extends Jet {

	@Override
	public void fly() {
		super.fly();
		System.out.println("I am a Passenger jet and I fly at the speed my passengers feel comfortable with.");
		System.out.println();
	}

	public JetImpl(String type, String model, double speed, int range, double price) {
		super(type, model, speed, range, price);

	}

}
