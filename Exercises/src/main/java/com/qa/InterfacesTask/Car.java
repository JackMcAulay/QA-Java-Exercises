package com.qa.InterfacesTask;

abstract class Car implements Vehicle, HeadLights{
    @Override
    public void drive() {
        System.out.println("The Car drives forward at 60 mph");
    }

    @Override
    public void stop() {
        System.out.println("The car Stops");
    }

    @Override
    public void park() {
        System.out.println("You park the car in the Car Park");
    }

    @Override
    public void headLightsOn() {
        System.out.println("The 2 Main headlights are turned On");
    }

    @Override
    public void headLightsOff() {
        System.out.println("The 2 Main headlights are turned Off");
    }
}
