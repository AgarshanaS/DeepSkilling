import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert that 2 + 3 is equal to 5
        assertEquals(5, 2 + 3);

        // Assert that 5 is greater than 3
        assertTrue(5 > 3);

        // Assert that 5 is NOT less than 3
        assertFalse(5 < 3);

        // Assert that the value is null
        Object obj = null;
        assertNull(obj);

        // Assert that the value is not null
        Object anotherObj = new Object();
        assertNotNull(anotherObj);
    }
}
