package com.qa.menu;

import com.qa.garage.Garage;
import com.qa.vehicles.Car;
import com.qa.vehicles.Motorbike;
import com.qa.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorbikeMenu implements VehicleMenu<Motorbike> {
	Garage garage = Garage.getInstance();
	Scanner scan = new Scanner(System.in);

	public void createVehicle() {
		System.out.println("How many Wheels?");
		int wheels = scan.nextInt();
		scan.nextLine();
		System.out.println("Registration?");
		String reg = scan.nextLine();
		System.out.println("Side Car? true/false");
		boolean sideCar = scan.nextBoolean();
		scan.nextLine();

		garage.addVehicle(new Motorbike(wheels, reg, sideCar));
	}

	public List<Motorbike> readByType() {
		List<Motorbike> found = new ArrayList<Motorbike>();

		for(Vehicle vehicle: garage.getStorage()) {
			if (vehicle instanceof Motorbike) {
				found.add((Motorbike) vehicle);
			}
		}
		return found;
	}

	public void deleteByType() {
		for(Vehicle vehicle: garage.getStorage()) {
			if (vehicle instanceof Motorbike) {
				garage.removeByID(vehicle.getID());
			}
		}
	}

	public void updateVehicle(int ID) {
		for(Vehicle vehicle: garage.getStorage()) {
			if (vehicle.getID() == ID) {
				System.out.println("How many Wheels? Current = " + vehicle.getWheels());
				vehicle.setWheels(scan.nextInt());
				scan.nextLine();
				System.out.println("Registration? Current = " + vehicle.getReg());
				vehicle.setReg(scan.nextLine());
				System.out.println("Side Car? true/false Current = " + ((Motorbike)vehicle).isSidecar());
				((Motorbike)vehicle).setSidecar(scan.nextBoolean());
				scan.nextLine();
			}
		}
	}
}
