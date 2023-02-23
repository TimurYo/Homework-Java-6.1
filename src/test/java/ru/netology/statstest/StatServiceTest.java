package ru.netology.statstest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import ru.netology.stats.StatService;

public class StatServiceTest {
    @Test
    public void testSumOfSales() {
        int expected = 170;
        long[] sales= {10, 2,13,18, 22, 1,4, 100};
        StatService service= new StatService();
        int actual = service.getSumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testAverageOfSales() {
        int expected = 19;
        long [] sales = {10 , 2,13,18, 22, 1,3,4, 100};
        StatService service= new StatService();
        int actual = service.getAverageOfSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxSales(){
        int expected = 9 ;
        long [] sales = {10 , 2,13,18, 22, 1,3,4, 100};
        StatService service= new StatService();
        int actual = service.getMaxAmountOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        int expected= 6;
        long[] sales = {10 , 2,13,18, 22, 1,3,4, 100};
        StatService service= new StatService();
        int actual = service.getMinAmountOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsWithLowSales() {
        int expected = 7;
        long[] sales = {10 , 2,13,18, 22, 1,3,4, 100};
        StatService service= new StatService();
        int actual = service.getAmountOfMonthWithLowSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsWithHighSales() {
        int expected = 2;
        long[] sales = {10 , 2,13,18, 22, 1,3,4, 100};
        StatService service= new StatService();
        int actual = service.getAmountOfMonthWithHighSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
