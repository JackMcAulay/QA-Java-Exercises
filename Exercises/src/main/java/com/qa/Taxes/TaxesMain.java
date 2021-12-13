package com.qa.Taxes;

public class TaxesMain {
    public static void main(String[] args){
        Tax tax = new Tax();
        System.out.println(tax.getTaxRate(15000));
        System.out.println(tax.getTaxAmount(15000));
    }
}
