package assignment4.DIP;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Admin on 2017/03/30.
 */
public class PowerSwitchTest {
        Switchable switchableBulb;
        Switchable switchableFan;
        Switch bulbPowerSwitch;
        Switch fanPowerSwitch;

        @Before
        public void setUp() throws Exception {
            switchableBulb   = new LightBulb();
            switchableFan = new Fan();
            //bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
            bulbPowerSwitch = new ElectricPowerSwitch(new LightBulb());
            fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
        }

        @Test
        public void testPress() throws Exception {
            bulbPowerSwitch.press();
            bulbPowerSwitch.press();
            fanPowerSwitch.press();
            fanPowerSwitch.press();
        }
    }
