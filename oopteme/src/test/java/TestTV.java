import Tema5.TV;
import org.junit.Assert;
import org.junit.Test;

public class TestTV {
    TV newTV = new TV(41,2,false);
    TV newTV1 = new TV(35,3,true);

    @Test
    public void ChangeNextChTest(){
        newTV.changeNextChannel();
        newTV1.changeNextChannel();
        newTV1.setNrChannel(45);
        Assert.assertEquals(48,newTV1.getNrChannel());
    }

    @Test
    public void setUpVolTest(){
        Assert.assertEquals(5,newTV1.getVolume());
    }

}
