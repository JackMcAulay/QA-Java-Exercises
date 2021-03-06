package com.qa.vehicles;

public class Truck extends Vehicle {
	
	private int capacity;

	public Truck(int wheels, String reg, int capacity) {
		super(wheels, reg);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public int bill() {
		return 500;
	}

	@Override
	public String toString() {
		return "Truck{" +
				"ID=" + this.getID() +
				", wheels=" + this.getWheels() +
				", reg='" + this.getReg() + '\'' +
				", capacity=" + capacity + '}';
	}
}
