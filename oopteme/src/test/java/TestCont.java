import Tema4.Cont;
import org.junit.Assert;
import org.junit.Test;

public class TestCont {
    Cont c1 = new Cont(1, 100);

    @Test
    public void depozitTest() {
        //System.out.println("depozit " + c1.depozit(250));
        Assert.assertEquals(350.0, c1.depozit(250), 0.0);
    }

    @Test
    public void retragTest() {
        //System.out.println("depozit " + c1.depozit(250));
        Assert.assertEquals(350.0, c1.depozit(150), 0.0);
    }

    @Test
    public void getMonthlyInterestRateTest(){
        //System.out.println("Dob lunara " + c1.getMonthlyInterestRate());
        Assert.assertEquals(0.0083, c1.getMonthlyInterestRate(), 0.0);
    }
}
