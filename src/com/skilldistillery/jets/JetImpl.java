package com.skilldistillery.jets;

public class JetImpl extends Jet {

	@Override
	public void fly() {
		super.fly();
		System.out.println("i fly at the speed i fly at");
	}
		
		
	public JetImpl(String type, String model, double speed, int range, double price) {
		super(type, model, speed, range, price);

	}

}
