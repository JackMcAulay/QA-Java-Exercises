package com.qa.InterfacesTask2;

public class Car extends Vehical{
    @Override
    public void engineSpecs() {
        System.out.println("It has a 1.5L V6 Engine.");
    }

    @Override
    public void topSpeed() {
        System.out.println("It can go 120mph.");
    }

    @Override
    public void wheelAmount() {
        System.out.println("It has 4 wheels.");
    }
}
