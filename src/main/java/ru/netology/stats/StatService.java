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
        int x = (int) getSumOfSales(sales); //переменная суммы из метода getSumOfSales

        int average = x / sales.length;
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
        int y = (int) getAverageOfSales(sales); //переменная суммы из метода getAverageOfSales

        int monthWithLowSales = 0;
        for (long sale : sales) {
            if (sale <= y) {
                monthWithLowSales++;
            }
        }
        return monthWithLowSales;

    }

    public int getAmountOfMonthWithHighSales(long[] sales) {
        int y = (int) getAverageOfSales(sales); //переменная суммы из метода getAverageOfSales

        int monthWithHighSales = 0;
        for (long sale : sales) {
            if (sale >= y) {
                monthWithHighSales++;
            }
        }
        return monthWithHighSales;
    }

}
