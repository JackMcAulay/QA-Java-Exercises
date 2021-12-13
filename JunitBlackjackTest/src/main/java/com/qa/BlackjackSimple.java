package com.qa;

public class BlackjackSimple {
    public static String play(int dealer, int player) {
        if (dealer > 21 && player > 21) {
            return "Both Bust";
        } else if (dealer > 21) {
            return "Dealer Bust, Player Wins!";
        } else if (player > 21) {
            return "Player Bust, Dealer Wins!";
        }

        if (dealer == player){
            return "Draw";
        }else if (dealer > player){
            return "Dealer Wins!";
        }
        return "Player Wins!";
    }
}
