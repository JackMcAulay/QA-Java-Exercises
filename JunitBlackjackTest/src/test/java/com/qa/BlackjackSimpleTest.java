package com.qa;

import org.junit.Assert;
import org.junit.Test;

public class BlackjackSimpleTest {
    @Test
    public void playerWinsTest(){
        Assert.assertEquals("Player Wins!", BlackjackSimple.play(1, 21));
    }

    @Test
    public void dealerWinsTest(){
        Assert.assertEquals("Dealer Wins!", BlackjackSimple.play(21, 1));
    }

    @Test
    public void drawTest(){
        Assert.assertEquals("Draw", BlackjackSimple.play(16, 16));
    }

    @Test
    public void playerBust(){
        Assert.assertEquals("Player Bust, Dealer Wins!", BlackjackSimple.play(20, 23));
    }

    @Test
    public void dealerBust(){
        Assert.assertEquals("Dealer Bust, Player Wins!", BlackjackSimple.play(23, 20));
    }

    @Test
    public void bothBust(){
        Assert.assertEquals("Both Bust", BlackjackSimple.play(23, 23));
    }
}