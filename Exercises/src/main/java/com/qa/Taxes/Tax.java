package com.qa.Taxes;

public class Tax {
    public int getTaxRate(int salary){
        if (salary > 0 & salary < 15000){
            return 0;
        } else if (salary > 14999 & salary < 20000){
            return 10;
        } else if (salary > 19999 & salary < 30000) {
            return 15;
        } else if (salary > 29999 & salary < 45000) {
            return 20;
        }
        return 25;
    }

    public double getTaxAmount(int salary){
        return ((double) salary * (double) getTaxRate(salary)) / 100;
    }
}
