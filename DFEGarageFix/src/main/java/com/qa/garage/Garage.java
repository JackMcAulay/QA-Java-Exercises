package com.qa.garage;

import com.qa.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Garage {
	
	private List<Vehicle> storage = new ArrayList<Vehicle>();

	private static Garage instance = null;

	private Garage() {

	}

	public static Garage getInstance() {
		if (instance==null) {
			instance = new Garage();
		}
		return instance;
	}

	public void addVehicle(Vehicle vehicle) {
		storage.add(vehicle);
	}

	public List<Vehicle> getStorage() {
		return storage;
	}

	public Vehicle getByID(int id){
		for (Vehicle vehicle : storage){
			if (vehicle.getID() == id){
				return vehicle;
			}
		}
		return null;
	}
	
	public void removeByID(int ID) {
		Iterator<Vehicle> iterator = storage.iterator();

		while(iterator.hasNext()){
			Vehicle vehicle = iterator.next();

			if (vehicle.getID()==ID) {
				iterator.remove();
			}
		}
	}
	
	public String fixByID(int ID) {
		Iterator<Vehicle> iterator = storage.iterator();

		while(iterator.hasNext()) {
			Vehicle vehicle = iterator.next();

			if (vehicle.getID() == ID) {
				return "Vehicle ID " + ID + " Costs $" + vehicle.bill();
			}
		}
		return "";
	}
	
	public void emptyGarage() {
		storage.clear();
	}
	
	public void billing() {
		for (Vehicle vehicle: storage) {
			System.out.println("Vehicle Reg: "+ vehicle.getReg()+" Bill: $"+vehicle.bill());
		}	
	}


}