package com.qa.Calculator;

public class CalculatorMain {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.add(5, 10);
        calc.subtract(50, 24);
        calc.multiply(12, 12);
        calc.divide(2, 5);
    }
}
