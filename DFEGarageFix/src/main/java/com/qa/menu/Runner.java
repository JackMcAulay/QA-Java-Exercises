package com.qa.menu;

import com.qa.garage.Garage;
import com.qa.vehicles.Car;

public class Runner {
    public static void main(String[] args){
        //MainMenu.getInstance().start();
        Car testCar = new Car(4, "CR22 TST", false);
        Garage.getInstance().addVehicle(testCar);

        System.out.println(Garage.getInstance().getStorage());
    }
}
