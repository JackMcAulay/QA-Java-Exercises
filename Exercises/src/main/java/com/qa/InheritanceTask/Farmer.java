package com.qa.InheritanceTask;

public class Farmer extends Person{
    private String farmName;
    private int numberOfAnimals;

    public Farmer(String name, int age, String farmName, int numberOfAnimals) {
        super(name, age);
        this.farmName = farmName;
        this.numberOfAnimals = numberOfAnimals;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    @Override
    public void sleep(){
        System.out.println("Zzz....sheep....cows...zzzz");
    }

    @Override
    public void eat(){
        System.out.println("Eats a Ham sandwich in the Barn");
    }

    @Override
    public String toString() {
        return "Banker{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getName() + '\'' +
                ", farmName='" + farmName + '\'' +
                ", numberOfAnimals='" + numberOfAnimals + '\'' + '}';
    }
}
