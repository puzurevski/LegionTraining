import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DayOfWeekTest {

    // Positive test
    @Test
    public void testPositiveDays() {
        DayOfWeek dayOfWeek = new DayOfWeek();
        assertEquals("Sunday", dayOfWeek.getDay(1));
        assertEquals("Monday", dayOfWeek.getDay(2));
        assertEquals("Tuesday", dayOfWeek.getDay(3));
        assertEquals("Wednesday", dayOfWeek.getDay(4));
        assertEquals("Thursday", dayOfWeek.getDay(5));
        assertEquals("Friday", dayOfWeek.getDay(6));
        assertEquals("Saturday", dayOfWeek.getDay(7));
    }

    // Negative test <1
    @Test
    public void testInvalidLowerBound() {
        DayOfWeek dayOfWeek = new DayOfWeek();
        assertEquals("The number should be between 1 and 7.", dayOfWeek.getDay(0));
    }
    // Negative test >7
    @Test
    public void testInvalidUpperBound() {
        DayOfWeek dayOfWeek = new DayOfWeek();

        assertTrue("The number should be between 1 and 7.".equalsIgnoreCase(dayOfWeek.getDay(8)));
    }
    // NULL value
    @Test
    public void testNullInput() {
        DayOfWeek dayOfWeek = new DayOfWeek();

        assertNull(dayOfWeek.getDay(null));
    }
}


