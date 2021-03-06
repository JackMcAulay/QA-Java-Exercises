package com.qa.vehicles;

public class Car extends Vehicle {
	
	private boolean heatedSeats;

	public Car(int wheels, String reg, boolean heatedSeats) {
		super(wheels, reg);
		this.heatedSeats = heatedSeats;
	}

	public boolean isHeatedSeats() {
		return heatedSeats;
	}

	public void setHeatedSeats(boolean heatedSeats) {
		this.heatedSeats = heatedSeats;
	}

	@Override
	public int bill() {
		return 250;
	}

	@Override
	public String toString() {
		return "Car{" +
				"ID=" + this.getID() +
				", wheels=" + this.getWheels() +
				", reg='" + this.getReg() + '\'' +
				", heatedSeats=" + heatedSeats + '}';
	}
}
