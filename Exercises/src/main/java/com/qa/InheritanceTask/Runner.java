package com.qa.InheritanceTask;

public class Runner {
    public static void main(String[] args){
//        System.out.println("-----Person-----");
//        Person p = new Person("Dave", 32);
//        System.out.println(p);
//        p.eat();
//        p.sleep();
//
//        System.out.println("\n-----Banker-----");
//        Banker b = new Banker("John", 27, "HSBC", "Manager");
//        System.out.println(b);
//        b.eat();
//        b.sleep();
//
//        System.out.println("\n-----Farmer-----");
//        Farmer f = new Farmer("Keith", 42, "Keith's Farm", 200);
//        System.out.println(f);
//        f.eat();
//        f.sleep();

        Farmer ff = new Farmer("Keith", 42, "Keith's Farm", 200);
        Person pf = new Farmer("Roy", 42, "Roy's Farm", 210);
        Object of = new Farmer("Bob", 42, "Bob's Farm", 150);

        System.out.println("\n-----Farmer Farmer-----");
        System.out.println(ff);
        System.out.println(ff.getFarmName());
        ff.eat();
        ff.sleep();

        System.out.println("\n-----Person Farmer-----");
        System.out.println(pf);
        System.out.println(((Farmer)pf).getFarmName());
        pf.eat();
        pf.sleep();

        System.out.println("\n-----Object Farmer-----");
        System.out.println(of);
        System.out.println(((Farmer)of).getFarmName());
        ((Farmer)of).eat();
        ((Farmer)of).sleep();
    }
}
