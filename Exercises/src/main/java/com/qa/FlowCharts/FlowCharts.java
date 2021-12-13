package com.qa.FlowCharts;

public class FlowCharts {
    public int a;

    public FlowCharts(int a) {
        this.a = a;
    }

    public void run(){
        if (a > 2000){
            System.out.print("A");
            if (a > 6000){
                System.out.print("C");
            } else{
                System.out.print("B");
                if (a > 4000){
                    System.out.print("D");
                } else{
                    System.out.print("E");
                }
            }
        } else{
            System.out.print("1");
            if (a > 100){
                System.out.print("3");
                if (a > 600){
                    System.out.print("5");
                } else{
                    System.out.print("4");
                    if (a > 500){
                        System.out.print("6");
                    } else{
                        System.out.print("7");
                    }
                }
            } else{
                System.out.print("2");
            }
        }
    }
}
