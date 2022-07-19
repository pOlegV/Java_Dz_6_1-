import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.Dz_5_1.service.StatsService;

public class StatsServiceTest {
    @Test
    public void totalAllSalesTest() {
        int expected = 180;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.totalAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void averageSumAllSalesTest() {
        int expected = 15;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.averageSumAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maxSalesTest() {
        int expected = 8;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minSalesTest() {
        int expected = 9;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void numberMonthsBelowAverageTest() {
        int expected = 5;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.numberMonthsBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void numberMonthsAboveAverageTest() {
        int expected = 5;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.numberMonthsAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
