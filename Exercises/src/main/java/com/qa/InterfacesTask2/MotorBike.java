package com.qa.InterfacesTask2;

public class MotorBike extends Vehical{
    @Override
    public void engineSpecs() {
        System.out.println("It has a inline 4 Engine.");
    }

    @Override
    public void topSpeed() {
        System.out.println("It can go 90mph.");
    }

    @Override
    public void wheelAmount() {
        System.out.println("It has 2 wheels.");
    }
}
