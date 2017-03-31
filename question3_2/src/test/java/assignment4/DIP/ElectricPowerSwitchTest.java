package assignment4.DIP;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Admin on 2017/03/31.
 */
public class ElectricPowerSwitchTest {
    LightBulb bulb;
    ElectricPowerSwitch powerSwitch;

    @Before
    public void setUp() throws Exception {
        bulb = new LightBulb();
        powerSwitch = new ElectricPowerSwitch(bulb);
    }

    @Test
    public void testPress() throws Exception {
        powerSwitch.press();
    }
}