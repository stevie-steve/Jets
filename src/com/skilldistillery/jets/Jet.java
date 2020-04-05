package com.skilldistillery.jets;

public abstract class Jet {
	private String type;
	private String model;
	private double speed;
	private int range;
	private double price;
	
	public Jet(String type, String model, double speed, int range, double price) {
		super();
		this.type = type;
		this.model = model; 
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public Jet() {	
	}

	public void fly() {
		System.out.println("Jet [type=" + type + ", model=" + model + ", speed=" + speed + ", range=" + range + ", price= $" + price
				+ "]");
		int machSpeed = (int)speed / 767;
		System.out.println("This jet can reach MOCH" + machSpeed + ".");
		double flightTime =(range / speed);
		System.out.printf(flightTime + " Hours of flight time");
		System.out.println();
	}

	public double speedInMach(double speed, double range) {
		double mach = speed / range;
		return mach;

	}
 
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet [type=" + type + ", model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + range;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(speed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) 
			return false;
		Jet other = (Jet) obj;
		if (range != other.range)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (Double.doubleToLongBits(speed) != Double.doubleToLongBits(other.speed))
			return false;
		return true;
	}

}
