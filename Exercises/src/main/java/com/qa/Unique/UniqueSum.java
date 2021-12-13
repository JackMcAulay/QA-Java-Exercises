package com.qa.Unique;

public class UniqueSum {
    public int input(int a, int b, int c){
        int sum = 0;
        if (a != b & b != c){
            return sum;
        }
        sum += a;
        if (b != a){
            sum += b;
        }
        if (c != a & c != b){
            sum += c;
        }
        return sum;
    }
}
