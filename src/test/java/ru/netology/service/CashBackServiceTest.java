package ru.netology.service;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CashBackServiceTest {
    @Test
    public void testRemainWithLessThanBoundary() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 500;
        int result = service.remain(amount);
        Assert.assertEquals(result, 500);
    }

    @Test
    public void testRemainWithExactlyBoundary() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int result = service.remain(amount);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testRemainWithGreaterThanBoundary() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1500;
        int result = service.remain(amount);
        Assert.assertEquals(result, 500);
    }
}
