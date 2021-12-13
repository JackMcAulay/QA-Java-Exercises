package com.qa.menu;

import com.qa.garage.Garage;
import com.qa.vehicles.Car;
import com.qa.vehicles.Motorbike;
import com.qa.vehicles.Truck;
import com.qa.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckMenu implements VehicleMenu<Truck> {
	Garage garage = Garage.getInstance();
	Scanner scan = new Scanner(System.in);

	public void createVehicle() {
		System.out.println("How many Wheels?");
		int wheels = scan.nextInt();
		scan.nextLine();
		System.out.println("Registration?");
		String reg = scan.nextLine();
		System.out.println("Truck Capacity?");
		int capacity = scan.nextInt();
		scan.nextLine();

		garage.addVehicle(new Truck(wheels, reg, capacity));
	}

	public List<Truck> readByType() {
		List<Truck> found = new ArrayList<Truck>();

		for(Vehicle vehicle: garage.getStorage()) {
			if (vehicle instanceof Truck) {
				found.add((Truck) vehicle);
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
				System.out.println("Truck Capacity? Current = " + ((Truck)vehicle).getCapacity());
				((Truck)vehicle).setCapacity(scan.nextInt());
				scan.nextLine();
			}
		}
	}
}
