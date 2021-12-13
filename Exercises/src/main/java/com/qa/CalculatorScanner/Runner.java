package com.qa.CalculatorScanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    static Scanner scanner = new Scanner(System.in);

    public static int getNum(String msg){
        while (true){
            try{
                System.out.println(msg);
                int i = scanner.nextInt();
                return i;
            } catch (InputMismatchException e){
                System.out.println("That is not an Integer");
            }
        }
    }

    public static String getString(){
        try{
            return scanner.nextLine();
        } catch (InputMismatchException e){
            System.out.println(e);
            return "";
        }
    }

    public static void main(String[] args){
        int num1 = getNum("Enter First Number :");
        scanner.nextLine();
        System.out.println("Enter the operator :");
        String opp = getString();
        int num2 = getNum("Enter Second Number :");

        Calculator.calculate(num1, num2, opp);
    }
}
