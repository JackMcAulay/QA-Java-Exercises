package com.qa.Calculator;

public class Calculator {
    public void add (int a, int b) {
        System.out.println(a + b);
    }

    public void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public void divide (double a, double b) {
        if (a < b){
            System.out.println("The division cannot be performed");
        } else {
            System.out.println(a + b);
        }
    }
}
