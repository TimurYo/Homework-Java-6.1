package ru.netology.statstest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatService;

public class StatServiceTest {
    @Test
    public void testSumOfSales() {
        long expected = 170;
        long[] sales = {10, 2, 13, 18, 22, 1, 4, 100};
        StatService service = new StatService();
        long actual = service.getSumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageOfSales() {
        long expected = 19;
        long[] sales = {10, 2, 13, 18, 22, 1, 3, 4, 100};
        StatService service = new StatService();
        long actual = service.getAverageOfSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxSales() {
        long expected = 9;
        long[] sales = {10, 2, 13, 18, 22, 1, 3, 4, 100};
        StatService service = new StatService();
        long actual = service.getMaxAmountOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        long expected = 6;
        long[] sales = {10, 2, 13, 18, 22, 1, 3, 4, 100};
        StatService service = new StatService();
        long actual = service.getMinAmountOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsWithLowSales() {
        long expected = 7;
        long[] sales = {10, 2, 13, 18, 22, 1, 3, 4, 100};
        StatService service = new StatService();
        long actual = service.getAmountOfMonthWithLowSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsWithHighSales() {
        long expected = 2;
        long[] sales = {10, 2, 13, 18, 22, 1, 3, 4, 100};
        StatService service = new StatService();
        long actual = service.getAmountOfMonthWithHighSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
