package com.qa.accessModifiers;

public class Runner {
    // the main method is the entry point
    public static void main(String[] args) throws Exception {
        Animal a = new Animal();
        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(a.toString());
        a.sound();

        Orange cat = new Orange("Dave", 6, 42);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.toString());
        cat.sound();
    }
}
class Animal {
    private String name;
    private  int age;

    public Animal() {}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void sound(){
        System.out.println("Growl");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age + '}';
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
}

final class Orange extends Cat {
    private int numberOfWhiskers;

    public Orange(String name, int age, int numberOfWhiskers) {
        super(name, age);
        this.numberOfWhiskers = numberOfWhiskers;
    }

    public int getNumberOfWhiskers() {
        return numberOfWhiskers;
    }

    public void setNumberOfWhiskers(int numberOfWhiskers) {
        this.numberOfWhiskers = numberOfWhiskers;
    }

    @Override
    public void sound(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + this.getName() + '\'' + ", " +
                "age=" + this.getAge() + '\'' + ", " +
                "numberOfWhiskers=" + numberOfWhiskers + '}';
    }
}