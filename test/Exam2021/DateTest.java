package Exam2021;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DateTest {

    @Test
    public void constructor1Test() {
        Date now = new Date();

        assertEquals(2021, now.date.getYear());
        assertEquals(4, now.date.getMonthValue());
        assertEquals(11, now.date.getDayOfMonth());
    }

    @Test
    public void constructor2Test() {
        Date now = new Date(2021, 2, 19);

        assertEquals(2021, now.date.getYear());
        assertEquals(2, now.date.getMonthValue());
        assertEquals(19, now.date.getDayOfMonth());
    }

    @Test
    public void dateDiffTest() {
        Date d1 = new Date(2021, 4, 9);
        Date d2 = new Date(2021, 4, 30);

        assertTrue(Date.dayDiff(d2, d1) == 21);
    }
}
