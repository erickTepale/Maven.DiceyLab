import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void incrementBin() {
        Bins myBin = new Bins(2, 12);


        //before
        Integer before = myBin.getBin(10) + 1;

        //action
        myBin.incrementBin(10);

        //after
        Integer after = myBin.getBin(10);

        Integer[] bin = myBin.getBins();
        for (int i = 0; i < bin.length; i++) {
            System.out.println(i + " counter : data in bin " + bin[i]);
        }

        Assert.assertEquals(before, after);
    }

    @Test
    public void getBin() {
        Bins myBin = new Bins(2, 12);

        //before
        Integer before = myBin.getBin(10) + 1;

        //action
        myBin.incrementBin(10);

        //after
        Integer after = myBin.getBin(10);

        Assert.assertEquals(before, after);
    }
}