import InterfataGenerica.Patrat;
import InterfataGenerica.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestComparable {
    @Test
    public void TestComparable(){
        Patrat patrat1 = new Patrat(3);
        Patrat patrat2 = new Patrat(4);
        Assert.assertEquals(patrat1.compareTo(patrat2),1);

        Person pers1 = new Person(63);
        Person pers2 = new Person(56);
        Assert.assertEquals(pers1.compareTo(pers2),-1);
    }
}
