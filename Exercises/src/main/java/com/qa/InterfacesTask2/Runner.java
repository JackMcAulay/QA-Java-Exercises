package com.qa.InterfacesTask2;

public class Runner {
    public static void main(String[] args){
        System.out.println("----Car----");
        Car car = new Car();
        car.engineSpecs();
        car.topSpeed();
        car.wheelAmount();

        System.out.println("\n----Bike----");
        MotorBike bike = new MotorBike();
        bike.engineSpecs();
        bike.topSpeed();
        bike.wheelAmount();
    }
}
