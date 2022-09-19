package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = service.averageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindMaxSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMonth);
    }

    @Test
    public void shouldFindMinSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMonth);
    }

    @Test
    public void shouldFindMonthsWithSalesUnderAverage(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsWithSalesUnderAverage = 5;
        int actualMonthsWithSalesUnderAverage = service.monthsWithSalesUnderAverage(sales);

        Assertions.assertEquals(expectedMonthsWithSalesUnderAverage, actualMonthsWithSalesUnderAverage);
    }

    @Test
    public void shouldFindMonthsWithSalesAboveAverage(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsWithSalesAboveAverage = 5;
        int actualMonthsWithSalesAboveAverage = service.monthsWithSalesAboveAverage(sales);

        Assertions.assertEquals(expectedMonthsWithSalesAboveAverage, actualMonthsWithSalesAboveAverage);
    }

}
