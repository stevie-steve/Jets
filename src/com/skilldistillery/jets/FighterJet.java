package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet() {

	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("I fly fast.");
		System.out.println();
	} 

	public void fight() {
		System.out.println(this.getModel() + " coming in guns blazing!");
		System.out.println("*Shoot Shoot, Bang Bang*");
		System.out.println();

	}

	@Override
	public double speedInMach(double speed, double range) {
		return super.speedInMach(speed, range);
	}

	public FighterJet(String type, String model, double speed, int range, double price) {
		super(type, model, speed, range, price);

	}

}
