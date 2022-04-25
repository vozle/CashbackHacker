package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateRemainAmount2000() {
        int actual = service.remain(2000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainAmountLess1000() {
        int actual = service.remain(864);
        int expected = 136;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainAmountMore1000() {
        int actual = service.remain(1720);
        int expected = 280;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainAmount0() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }
}