package com.qa.accessModifiers;

public class Owl extends Bird{
    private int wingspan;

    public Owl(String name, int wingspan) {
        super(name);
        this.wingspan = wingspan;
    }

    public void doThing(){
        System.out.println("Wingspan: " + this.wingspan + ", Flight?: " + super.getFly());
    }
}
