import Tema3.Stock;
import org.junit.Assert;
import org.junit.Test;

public class TestStock {
    Stock stoc1 = new Stock("s1", "fructe");
    Stock stoc2 = new Stock("s2", "legume", 100, 90);

    @Test
    public void testStocknName() {
        Assert.assertEquals("s1, fructe", stoc1.StocknName());
    }

    @Test
    public void testgetsimbolStoc() {
        Assert.assertEquals("s1", stoc1.getSimbolStoc());
    }

    @Test
    public void testgetStocNume() {
        Assert.assertEquals("fructe", stoc1.getStocNume());
    }


    @Test
    public void testgetChangePercent() {
        System.out.println("procent " + stoc2.getChangePercent());
        Assert.assertEquals(-10.0, stoc2.getChangePercent(), 0.0);

    }


}
