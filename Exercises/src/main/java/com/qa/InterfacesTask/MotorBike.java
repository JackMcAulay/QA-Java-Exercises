package com.qa.InterfacesTask;

public class MotorBike implements Vehicle, HeadLights{
    @Override
    public void drive() {
        System.out.println("The Motorbike drives forward at 45 mph");
    }

    @Override
    public void stop() {
        System.out.println("The Motorbike Stops");
    }

    @Override
    public void park() {
        System.out.println("You park the bike using the Kickstand");
    }

    @Override
    public void headLightsOn() {
        System.out.println("The 1 Main headlight is turned On");
    }

    @Override
    public void headLightsOff() {
        System.out.println("The 1 Main headlight is turned Off");
    }
}
