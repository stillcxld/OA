package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    void shouldReturn10IfAmountIs2000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }
}