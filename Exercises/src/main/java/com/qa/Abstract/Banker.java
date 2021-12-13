package com.qa.Abstract;

public class Banker extends Person {
    private String bank;
    private String role;

    public Banker(String name, int age, String bank, String role) {
        super(name, age);
        this.bank = bank;
        this.role = role;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void sleep(){
        System.out.println("Zzz....money..money..money...zzzz");
    }

    @Override
    public void eat(){
        System.out.println("Eats a Cheese sandwich in the Vault");
    }

    @Override
    public String toString() {
        return "Banker{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getName() + '\'' +
                ", bank='" + bank + '\'' +
                ", role='" + role + '\'' + '}';
    }
}
