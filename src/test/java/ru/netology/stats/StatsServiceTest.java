package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalSum() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calcSum(managerSales);

        assertEquals(expected, actual);
    }
    @Test
    void shouldFindAvg() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAvg(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithMax() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMonthWithMax(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithMin() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMonthWithMin(managerSales);

        assertEquals(expected, actual);
    }
    @Test
    void shouldFindMonthsWithLessThanAvg() {
    StatsService service = new StatsService();
    int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 5;
    int actual = service.findMonthsWithLessThanAvg(managerSales);

    assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthsWithMoreThanAvg() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findMonthsWithMoreThanAvg(managerSales);

        assertEquals(expected, actual);
    }
}
