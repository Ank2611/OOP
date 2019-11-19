import Tema2.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class TestRectangle {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(2, 5);

    @Test
    public void testgetArea () {
        Assert.assertEquals(1, r1.getLatime(), 0.0);
        Assert.assertEquals(1, r1.getLungime(), 0.0);
        Assert.assertEquals(1, r1.getArea(), 0.0);
        Assert.assertEquals(10, r2.getArea(), 0.0);
    }

    @Test
    public void testgetPerimeter () {
        Assert.assertEquals(2, r2.getLatime(), 0.0);
        Assert.assertEquals(1, r2.getLungime(), 0.0);
        Assert.assertEquals(4, r1.getPerimeter(), 0.0);
        Assert.assertEquals(30, r2.getPerimeter(), 0.0);
    }
}
