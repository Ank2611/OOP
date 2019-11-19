import Tema1.Cerc;
import org.junit.Assert;
import org.junit.Test;

public class TestCerc {

    @Test
    public void testcalcAria(){
        Cerc c1 = new Cerc();
        c1.setRaza(2.5);
        Assert.assertEquals(2.5, c1.getRaza(),0.0);
    }
}
