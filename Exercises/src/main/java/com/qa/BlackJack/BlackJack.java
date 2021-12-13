package com.qa.BlackJack;

public class BlackJack {
    public void play(int a, int b) {
        if (a > 21) {a = 0;}
        if (b > 21) {b = 0;}

        if (a == b){System.out.println(a);}
        if (a > b){System.out.println(a);}
        if (a < b){System.out.println(b);}
    }
}
