package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CashBackServiceTest {
    @Test
    public void testRemainWithLessThanBoundary() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 500;
        int result = service.remain(amount);
        Assertions.assertEquals(result, 500);
    }

    @Test
    public void testRemainWithExactlyBoundary() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int result = service.remain(amount);
        Assertions.assertEquals(result, 0);
    }

    @Test
    public void testRemainWithGreaterThanBoundary() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1500;
        int result = service.remain(amount);
        Assertions.assertEquals(result, 500);
    }
}
