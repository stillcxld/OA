package ru.netology.service;

import  static org.junit.Assert.assertEquals;

class CashbackHackServiceTest {
    @org.junit.Test
    public void testRemainWithCashback() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainWhenBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainWhen1BelowBounary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainWhen1AboveBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
}