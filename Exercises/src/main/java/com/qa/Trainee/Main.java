package com.qa.Trainee;

public class Main {
    public static void main(String[] args){
        Trainee trainee = new Trainee("Jack", 22);
        Trainee traineeClone = new Trainee("Jack", 21, 2);

        System.out.println(trainee);
        System.out.println(traineeClone);
    }
}
