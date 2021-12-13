package com.qa.Abstract;

public class Runner {
    public static void main(String[] args){
        System.out.println("\n-----Banker-----");
        Banker b = new Banker("John", 27, "HSBC", "Manager");
        System.out.println(b);
        b.eat();
        b.sleep();

        System.out.println("\n-----Farmer-----");
        Farmer f = new Farmer("Keith", 42, "Keith's Farm", 200);
        System.out.println(f);
        f.eat();
        f.sleep();
    }
}
