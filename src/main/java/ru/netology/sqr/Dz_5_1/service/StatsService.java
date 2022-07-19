package ru.netology.sqr.Dz_5_1.service;
public class StatsService {
    public long totalAllSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public long averageSumAllSales(long[] sales) {
        return (totalAllSales(sales) / sales.length);
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int numberMonthsBelowAverage(long[] sales) {
        int month = 0;
        long averageSum = averageSumAllSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (averageSum > sales[i]) {
                month = month + 1;
            }
        }
        return month;
    }
    public int numberMonthsAboveAverage(long[] sales) {
        int month = 0;
        long averageSum = averageSumAllSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (averageSum < sales[i]) {
                month = month + 1;
            }
        }
        return month;
    }


}
