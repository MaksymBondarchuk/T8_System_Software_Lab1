import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LabTest {

    @Test
    public void testGetLettersAndPrintStuff() throws Exception {
        Lab lab = new Lab();
        assertEquals(1+2+3, lab.GetLettersAndPrintStuff(123));
        assertEquals(1+2, lab.GetLettersAndPrintStuff(12));
        assertEquals(1, lab.GetLettersAndPrintStuff(1));
        assertEquals(0, lab.GetLettersAndPrintStuff(0));
        assertEquals(9+9+9+9+9, lab.GetLettersAndPrintStuff(99999));
    }
}