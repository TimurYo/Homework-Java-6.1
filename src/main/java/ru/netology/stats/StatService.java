package ru.netology.stats;

public class StatService {

    public long getSumOfSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (sum + sales[i]);
        }
        return sum;
    }

    public long getAverageOfSales(long[] sales) {
        long sumOfSales = getSumOfSales(sales); //переменная суммы из метода getSumOfSales

        long average = sumOfSales / sales.length;
        return average;
    }

    public long getMaxAmountOfSales(long[] sales) {

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

    public long getMinAmountOfSales(long[] sales) {
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

    public long getAmountOfMonthWithLowSales(long[] sales) {
        long averageOfSales = getAverageOfSales(sales); //переменная суммы из метода getAverageOfSales

        int monthWithLowSales = 0;
        for (long sale : sales) {
            if (sale <= averageOfSales) {
                monthWithLowSales++;
            }
        }
        return monthWithLowSales;

    }

    public long getAmountOfMonthWithHighSales(long[] sales) {
        long averageOfSales = getAverageOfSales(sales); //переменная суммы из метода getAverageOfSales

        int monthWithHighSales = 0;
        for (long sale : sales) {
            if (sale >= averageOfSales) {
                monthWithHighSales++;
            }
        }
        return monthWithHighSales;
    }

}
