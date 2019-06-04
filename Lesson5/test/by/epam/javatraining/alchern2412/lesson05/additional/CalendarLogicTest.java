package by.epam.javatraining.alchern2412.lesson05.additional;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Alex
 */
public class CalendarLogicTest {

    @Test
    public void testFindNextDay() {
        int dd = 26;
        int mm = 2;
        int yy = 2019;

        String expected = "27.2.2019";
        assertEquals(expected, CalendarLogic.findNextDay(dd, mm, yy));

    }

    @Test
    public void testFindNextDayALeapYear() {
        int dd = 29;
        int mm = 2;
        int yy = 2008;

        String expected = "1.3.2008";
        assertEquals(expected, CalendarLogic.findNextDay(dd, mm, yy));

    }
    
     @Test
    public void testFindNextDayNotALeapYear1() {
        int dd = 29;
        int mm = 2;
        int yy = 2019;

        String expected = "Error in day range [1 - 28|29|30|31], "
                            + "depends month and year";
        assertEquals(expected, CalendarLogic.findNextDay(dd, mm, yy));

    }


    @Test
    public void testFindNextDayNotALeapYear2() {
        int dd = 28;
        int mm = 2;
        int yy = 2019;

        String expected = "1.3.2019";
        assertEquals(expected, CalendarLogic.findNextDay(dd, mm, yy));

    }

    @Test
    public void testFindNextDayFalseDay() {
        int dd = -1;
        int mm = 11;
        int yy = 1999;

        String expected = "Error in day range [1 - 28|29|30|31], "
                + "depends month and year";
        assertEquals(expected, CalendarLogic.findNextDay(dd, mm, yy));
    }

    @Test
    public void testFindNextDayFalseMonth() {
        int dd = 1;
        int mm = 55;
        int yy = 1999;

        String expected = "Error in month range [1 - 12]";
        assertEquals(expected, CalendarLogic.findNextDay(dd, mm, yy));
    }

    @Test
    public void testFindNextDayFalseYear() {
        int dd = 1;
        int mm = 11;
        int yy = -432;

        String expected = "Error in year range [1 - ...]";
        assertEquals(expected, CalendarLogic.findNextDay(dd, mm, yy));
    }
}
