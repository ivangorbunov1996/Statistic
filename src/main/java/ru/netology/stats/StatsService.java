package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales){
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;
    }

    public long average(long[] sales){
        return sum(sales) / sales.length;
    }
    public int calcMonthTopSales(long[] sales) {
        int monthTop = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthTop] <= sales[i]){
                monthTop = i;

            }
        }
        return monthTop + 1;
    }
    public long minimum(long[] sales){
        return sum(sales) / sales.length;
    }
    public int calcMonthMinSales(long[] sales) {
        int monthTop = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthTop] >= sales[i]){
                monthTop = i;

            }
        }
        return monthTop + 1;
    }
    public int calcMonthsBellowAverage(long[] sales){
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale){
                counter++;
            }
        }
        return counter;
    }
    public int calcMonthsHigherAverage(long[] sales){
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale){
                counter++;
            }
        }
        return counter;
    }
}
