package com.qa.accessModifiers;

public class Chicken extends Bird {
    private int eggCount;

    public Chicken(String name, int eggCount) {
        super(name);
        this.eggCount = eggCount;
    }

    public void doThing(){
        System.out.println("Flight? " + super.getFly());
    }

    @Override
    public void noise(){
        System.out.println("Bwark");
    }
}
