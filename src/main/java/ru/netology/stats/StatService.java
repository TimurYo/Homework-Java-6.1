package ru.netology.stats;

public class StatService {

    public int getSumOfSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        return sum;
    }

    public int getAverageOfSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        int average = sum / sales.length;
        return average;
    }

    public int getMaxAmountOfSales(long[] sales) {

        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;

        }
        return maxMonth + 1;
    }

    public int getMinAmountOfSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getAmountOfMonthWithLowSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }

        int average = sum / sales.length;

        int monthWithLowSales = 0;
        for (long sale : sales) {
            if (sale <= average) {
                monthWithLowSales++;
            }
        }
        return monthWithLowSales;

    }

    public int getAmountOfMonthWithHighSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }

        int average = sum / sales.length;

        int monthWithHighSales = 0;
        for (long sale : sales) {
            if (sale >= average) {
                monthWithHighSales++;
            }
        }
        return monthWithHighSales;
    }

}
