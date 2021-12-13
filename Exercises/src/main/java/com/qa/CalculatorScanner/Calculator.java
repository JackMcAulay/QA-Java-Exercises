package com.qa.CalculatorScanner;

public class Calculator {
    public static void calculate (int a, int b, String opp) {
        if(opp.equals("+")){
            add(a, b);
        }else if (opp.equals("-")){
            subtract(a, b);
        }else if (opp.equals("*")) {
            multiply(a, b);
        }else if (opp.equals("/")) {
            divide(a, b);
        }else{
            System.out.println("Operator not recognised");
        }
    }

    public static void add(int a, int b) {
        System.out.println("\n" + a + " + " + b + " = " + (a + b));
    }

    public static void subtract(int a, int b) {
        System.out.println("\n" + a + " - " + b + " = " + (a - b));
    }

    public static void multiply(int a, int b) {
        System.out.println("\n" + a + " * " + b + " = " + (a * b));
    }

    public static void divide (double a, double b) {
        System.out.println("\n" + a + " / " + b + " = " + (a / b));
    }
}
