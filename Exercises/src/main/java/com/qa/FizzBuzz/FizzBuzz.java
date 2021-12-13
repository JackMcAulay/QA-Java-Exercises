package com.qa.FizzBuzz;

public class FizzBuzz {
    public int range;

    public FizzBuzz(int range) {
        this.range = range + 1;
    }

    public void run(){
        String output;
        for(int i = 1; i < this.range; i++){
            output = i + " ";
            if ((i % 3) == 0)
                output += "Fizz";
            if ((i % 5) == 0)
                output += "Buzz";

            System.out.println(output);
        }
    }
}
