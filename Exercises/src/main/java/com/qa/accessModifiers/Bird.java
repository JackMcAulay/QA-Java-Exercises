package com.qa.accessModifiers;

public class Bird {
    protected String name;
    protected boolean fly = true;

    public Bird(String name) {
        this.name = name;
    }

    public void noise(){
        System.out.println("tweet");
    }

    public boolean getFly(){
        return fly;
    }

    public void setFly(boolean newValueOfFly){
        this.fly = newValueOfFly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
