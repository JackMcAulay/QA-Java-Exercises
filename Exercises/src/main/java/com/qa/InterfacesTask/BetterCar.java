package com.qa.InterfacesTask;

public class BetterCar extends Car implements ConvertibleRoof{
    @Override
    public void drive() {
        System.out.println("The Car drives forward at 100 mph");
    }

    @Override
    public void roofUp() {
        System.out.println("Roof goes Up");
    }

    @Override
    public void roofDown() {
        System.out.println("Roof goes Down");
    }
}
