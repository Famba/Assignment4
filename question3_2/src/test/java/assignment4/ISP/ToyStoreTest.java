package assignment4.ISP;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Admin on 2017/03/31.
 */
public class ToyStoreTest {
    ToyStore toyHouse;

    @Before
    public void setUp() throws Exception {
        toyHouse = new ToyStore();

    }

    @Test
    public void testToys() throws Exception {
        toyHouse.setColor("green");
        toyHouse.move();
        toyHouse.fly();
        Assert.assertEquals(toyHouse.color, "green");
    }
}
