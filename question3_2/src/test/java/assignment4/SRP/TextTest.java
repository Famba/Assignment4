package assignment4.SRP;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Admin on 2017/03/31.
 */
public class TextTest {
    Text text;

    @Before
    public void setUp() throws Exception {
        text = new Text();
    }

    @Test
    public void testText() throws Exception {
        text.setText("The Amazing Spider man");
        text.setAuthor("Amy Smith");
        text.setLength(250);
        text.printText();
    }
}