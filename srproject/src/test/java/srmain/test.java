package srmain;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
    @Test
    public void logtest1() {
        app obj = new app();
        Assert.assertEquals(0, obj.log("Ramcharan", 13));
    }

    @Test
    public void logtest2() {
        app obj = new app();
        Assert.assertEquals(1, obj.log("raman", 3025));
    }
}