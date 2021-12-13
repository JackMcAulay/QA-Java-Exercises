package com.qa.Scanner;

public class FizzBuzzDiff {
    public void run(int range){
        String output;
        for (int i = 1; i < range + 1; i++){
            output = i + " ";
            output += fizz(i);
            output += buzz(i);
            System.out.println(output);
        }
    }

    public String fizz (int value){
        if (value % 3 == 0){
            return "Fizz";
        }
        return "";
    }

    public String buzz (int value){
        if (value % 5 == 0){
            return "Buzz";
        }
        return "";
    }
}
