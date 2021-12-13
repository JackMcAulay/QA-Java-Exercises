package com.qa.Results;

public class Results {
    public int physics;
    public int chemistry;
    public int biology;
    public int total;
    public double percentage;

    public Results(int physics, int chemistry, int biology) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.biology = biology;
        this.total = physics + chemistry + biology;
        this.percentage = calcPercentage(total, 450);
    }

    public void displayResults(){
        System.out.println("Physics - " + physics + "\nChemistry - " + chemistry + "\nBiology - " + biology);
        System.out.println("Total - " + total);
    }

    public void displayPercentage(){
        if (percentage > 60 & calcPercentage(physics, 150) > 60
                & calcPercentage(chemistry, 150) > 60 & calcPercentage(biology, 150) > 60){
            System.out.println("Percentage - " + percentage + " - Pass");
        } else {
            System.out.println("Percentage - " + percentage + " - Fail");
        }
    }

    public double calcPercentage(int total, int outOf){
        return Math.round(((double) total * 100) / outOf);
    }
}
