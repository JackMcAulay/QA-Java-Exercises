package com.qa.FizzBuzz;

public class FizzBuzzDiff {
    public int range;

    public FizzBuzzDiff(int range) {
        this.range = range + 1;
    }

    public void run(){
        String output;
        for (int i = 1; i < 101; i++){
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
