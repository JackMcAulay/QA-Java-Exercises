package com.qa.Arrays;

public class Arrays {
    public void ex1(){
        int[] intArray= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 10; i++){
            System.out.println(intArray[i]);
        }
    }
    public void ex2(){
        int intArray[] = new int[10];

        for (int i = 0; i < 10; i++){
            intArray[i] = i;
            System.out.println(intArray[i]);
        }

        for (int i = 0; i < 10; i++){
            intArray[i] = intArray[i] * 10;
            System.out.println(intArray[i]);
        }
    }
}
