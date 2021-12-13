package com.qa.Trainee;

import java.util.Objects;

public class Trainee {
    public String name;
    public int age;
    public int level;

    public Trainee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Trainee(String name, int age, int level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return age == trainee.age && Objects.equals(name, trainee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
