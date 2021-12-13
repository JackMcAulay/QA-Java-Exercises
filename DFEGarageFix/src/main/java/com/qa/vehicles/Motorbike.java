package com.qa.vehicles;

public class Motorbike extends Vehicle {
	
	private boolean sidecar;

	public Motorbike(int wheels, String reg, boolean sidecar) {
		super(wheels, reg);
		this.sidecar = sidecar;
	}

	public boolean isSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}

	@Override
	public int bill() {
		return 150;
	}

	@Override
	public String toString() {
		return "MotorBike{" +
				"ID=" + this.getID() +
				", wheels=" + this.getWheels() +
				", reg='" + this.getReg() + '\'' +
				", sideCar=" + sidecar + '}';
	}
}
