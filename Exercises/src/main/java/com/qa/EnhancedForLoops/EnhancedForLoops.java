package com.qa.EnhancedForLoops;

public class EnhancedForLoops {
    public void ex1(){
        String[] stringArray = {"Hello", "World"};

        for (String str : stringArray){
            System.out.println(str);
        }
    }

    public void ex2(){
        int intArray[] = new int[20];

        for (int i = 0; i < 20; i++){
            intArray[i] = i + 1;
        }

        for (int i : intArray){
            if (isEven(i)){
                System.out.println(i * i * i);
            }else {
                System.out.println(i * i);
            }
        }
    }

    public boolean isEven(int num){
        if (num % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
