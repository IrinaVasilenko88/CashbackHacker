package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerServiceTest {

    @Test
    public void testRemain() {
        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotShowRemain() {
        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @Test
    public void shouldShowRemainMore() {
        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(1600);
        int expected = 400;
        assertEquals(actual, expected);
    }
}