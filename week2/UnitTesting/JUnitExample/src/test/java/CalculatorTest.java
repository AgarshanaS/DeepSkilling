import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.example.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    // 🔹 Runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator();  // Arrange
        System.out.println("Setting up Calculator instance...");
    }

    // 🔹 Runs after each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Cleaning up Calculator instance...\n");
    }
    @Test
    public void testAdd() {
        // Arrange (already done in setUp)

        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        // Act
        int result = calculator.multiply(3, 4);

        // Assert
        assertEquals(12, result);
    }
    @Test
    public void testSubtract() {
        // Act
        int result = calculator.subtract(8, 4);

        // Assert
        assertEquals(4, result);
    }
}
