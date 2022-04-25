package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateRemainAmount1000() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainAmountLess1000() {
        int actual = service.remain(600);
        int expected = 400;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainAmountMore1000() {
        int actual = service.remain(1300);
        int expected = 700;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainAmount1() {
        int actual = service.remain(1);
        int expected = 999;

        assertEquals(actual, expected);
    }
}