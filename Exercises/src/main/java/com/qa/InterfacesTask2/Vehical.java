package com.qa.InterfacesTask2;

abstract class Vehical implements Engine, Wheels{
    @Override
    public void engineSpecs() {
        System.out.println("It has an engine.");
    }

    @Override
    public void topSpeed() {
        System.out.println("Can go an speed.");
    }

    @Override
    public void wheelAmount() {
        System.out.println("It has wheels.");
    }
}
