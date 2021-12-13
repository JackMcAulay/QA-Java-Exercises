package com.qa.InterfacesTask;

public class PushBike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("The Bike drives forward at 10 mph");
    }

    @Override
    public void stop() {
        System.out.println("The Bike Stops");
    }

    @Override
    public void park() {
        System.out.println("You park the bike using the Kickstand");
    }
}
