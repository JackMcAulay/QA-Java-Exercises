package com.qa.InterfacesTask;

public class Runner {
    public static void main(String[] args){
        System.out.println("-----Normal Car-----");
        NormalCar car = new NormalCar();
        car.drive();
        car.stop();
        car.headLightsOn();
        car.headLightsOff();
        car.park();

        System.out.println("\n-----Better Car-----");
        BetterCar betterCar = new BetterCar();
        betterCar.drive();
        betterCar.stop();
        betterCar.headLightsOn();
        betterCar.headLightsOff();
        betterCar.park();
        betterCar.roofDown();

        System.out.println("\n-----Push Bike-----");
        PushBike pushBike = new PushBike();
        pushBike.drive();
        pushBike.stop();
        pushBike.park();

        System.out.println("\n-----Motor Bike-----");
        MotorBike motorBike = new MotorBike();
        motorBike.drive();
        motorBike.stop();
        motorBike.headLightsOn();
        motorBike.headLightsOff();
        motorBike.park();
    }
}
