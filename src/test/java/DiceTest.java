import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void tossAndSum1() {
        Dice a = new Dice(50);
        Integer min = 50;
        Integer max = 50 * 6;

        Integer sum = a.tossAndSum();
        Assert.assertTrue(sum >= min && sum <= max);
    }

    @Test
    public void tossAndSum2(){
        Dice a = new Dice(2);
        Integer min = 2;
        Integer max = 2 * 6;

        Integer sum = a.tossAndSum();
        Assert.assertTrue(sum >= min && sum <= max);
    }

    @Test
    public void massTest(){
        for (int i = 0; i < 10000 ; i++) {
            tossAndSum2();
            System.out.println("Attempt: " + i);
        }
    }


}