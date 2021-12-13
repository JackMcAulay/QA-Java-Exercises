package com.qa.menu;

import com.qa.garage.Garage;

import java.util.Scanner;

public class MainMenu {
	
	Scanner scan = new Scanner(System.in);
	
	VehicleMenu<?> chosenVehicle;
	
	CarMenu carMenu = new CarMenu();
	TruckMenu truckMenu = new TruckMenu();
	MotorbikeMenu motorbikeMenu = new MotorbikeMenu();

	private static MainMenu instance = null;

	private MainMenu() {
	}

	public static MainMenu getInstance() {
		if (instance == null) {
			instance = new MainMenu();
		}
		return instance;
	}
	
	public void start() {
		System.out.println("What do you want to do?");
		System.out.println("1) Add a Vehicle");
		System.out.println("2) Read All Vehicles");
		System.out.println("3) Read By ID");
		System.out.println("4) Read By Type");
		System.out.println("5) Delete By ID");
		System.out.println("6) Delete By Type");
		System.out.println("7) Delete All");
		System.out.println("8) Update Currently Stored Vehicle ");
		System.out.println("9) Fix By ID");
		System.out.println("0) Exit The App");
		int choice = scan.nextInt();
		scan.nextLine();
		switch (choice) {
			case 1:
				choice();
				chosenVehicle.createVehicle();
				start();
				break;
			case 2:
				System.out.println(Garage.getInstance().getStorage());
				start();
				break;
			case 3:
				System.out.println(Garage.getInstance().getByID(ID()));
				start();
				break;
			case 4:
				choice();
				System.out.println(chosenVehicle.readByType());
				start();
				break;
			case 5:
				Garage.getInstance().removeByID(ID());
				start();
				break;
			case 6:
				choice();
				chosenVehicle.deleteByType();
				start();
				break;
			case 7:
				Garage.getInstance().emptyGarage();
				start();
				break;
			case 8:
				choice();
				chosenVehicle.updateVehicle(ID());
				start();
				break;
			case 9:
				System.out.println(Garage.getInstance().fixByID(ID()));
				start();
				break;
			case 0:
				break;
			default:
				start();
		}
	}

	public int ID(){
		System.out.println("Index of Vehicle :");

		int index = scan.nextInt();
		scan.nextLine();
		return index;
	}
	
	public void choice() {
		System.out.println("1) Car");
		System.out.println("2) Motorbike");
		System.out.println("3) Truck");
		
		int choice = scan.nextInt();
		scan.nextLine();
		
		switch(choice) {
		case 1:
			chosenVehicle = carMenu;
			break;
		case 2:
			chosenVehicle = motorbikeMenu;
			break;
		case 3:
			chosenVehicle = truckMenu;
			break;
		default:
			choice();
		}
	}
}
