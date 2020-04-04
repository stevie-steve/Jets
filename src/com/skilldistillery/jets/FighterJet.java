package com.skilldistillery.jets;

public class FighterJet extends Jet { // Implements CombatReady{

	public FighterJet() {

	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("I fly fast");
	} 

	public void fight() {

	}

	public void getMachSpeed() {

	}

	public FighterJet(String type, String model, double speed, int range, double price) {
		super(type, model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

}
