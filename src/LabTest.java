import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LabTest {
    Lab lab;

    @Before
    public void beforeTesting() {
        lab = new Lab();
    }

    @Test
    public void testGetLettersAndPrintStuff() throws Exception {
        assertEquals(1+2+3, lab.getLettersAndPrintStuff(123));
    }

    @Test
    public void testGetLettersAndPrintStuff1() throws Exception {
        assertEquals(1+2, lab.getLettersAndPrintStuff(12));
    }

    @Test
    public void testGetLettersAndPrintStuff2() throws Exception {
        assertEquals(1, lab.getLettersAndPrintStuff(1));
    }

    @Test
    public void testGetLettersAndPrintStuff3() throws Exception {
        assertEquals(0, lab.getLettersAndPrintStuff(0));
    }

    @Test
    public void testGetLettersAndPrintStuff4() throws Exception {
        assertEquals(9+9+9+9+9, lab.getLettersAndPrintStuff(99999));
    }

    @Test
    public void testHasOnly3Digits() throws Exception {
//        assertEquals(true);
    }
}