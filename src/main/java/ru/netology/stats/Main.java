package ru.netology.stats;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        StatService service = new StatService();
        long[] sales = {
                10, 2, 13, 18, 22, 1, 3, 4, 60000, 100
        };
        int amountOfSales = (int) service.getSumOfSales(sales);
        System.out.println(amountOfSales + " - сумма всех продаж");

        int averageOfSales = (int) service.getAverageOfSales(sales);
        System.out.println(averageOfSales + " - среднее арифметическое всех продаж");

        int max = (int) service.getMaxAmountOfSales(sales);
        System.out.println(max + " - порядковый номер месяца с наибольшим количеством продаж");

        int min = (int) service.getMinAmountOfSales(sales);
        System.out.println(min + " - порядковый номер месяца с наименьшим количеством продаж");

        int monthLowSales = (int) service.getAmountOfMonthWithLowSales(sales);
        System.out.println(monthLowSales + " - количество месяцев с продажами ниже среднего");

        int monthHighSales = (int) service.getAmountOfMonthWithHighSales(sales);
        System.out.println(monthHighSales + "- количество месяцев с продажами выше среднего");

    }
}
