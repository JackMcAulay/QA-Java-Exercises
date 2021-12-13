package com.qa.Scanner;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many Fizz Buzzez? : ");
        int choice = scan.nextInt();

        FizzBuzzDiff FB = new FizzBuzzDiff();
        FB.run(choice);
    }
}
