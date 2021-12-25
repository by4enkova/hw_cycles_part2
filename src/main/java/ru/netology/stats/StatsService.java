package ru.netology.stats;

public class StatsService {
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }


    public int findAvg(int[] sales) {
        return calcSum(sales) / sales.length;
    }


    public int findMonthWithMax(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            if (sale > sum) {
                sum = sale;
            }
        }
        int monthCount = 0;
        int monthWithMax = 0;
        for (int sale : sales) {
            monthCount = monthCount + 1;
            if (sale == sum) {
                monthWithMax = monthCount;
            }
        }
    return monthWithMax;
    }



    public int findMonthWithMin(int[] sales) {
        int sum = sales [0];
        for (int sale : sales) {
            if (sale < sum) {
                sum = sale;
            }
        }

        int monthCount = 0;
        int monthWithMin = 0;
        for (int sale : sales) {
            monthCount = monthCount + 1;
            if (sale == sum) {
                monthWithMin = monthCount;
            }

        }
        return monthWithMin;
    }



    public int findMonthsWithLessThanAvg(int[] sales) {
        int avg = findAvg(sales);
        int monthsCount = 0;
        for (int sale : sales) {
            if (sale < avg) {
                monthsCount++;
            }
        }
        return monthsCount;
    }


    public int findMonthsWithMoreThanAvg(int[] sales) {
        int avg = findAvg(sales);
        int monthsCount = 0;
        for (int sale : sales) {
            if (sale > avg) {
                monthsCount++;
            }
        }
        return monthsCount;
    }
}


