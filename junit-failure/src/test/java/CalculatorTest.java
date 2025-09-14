import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        // Intentional failing expectation: 2 + 2 != 5
        assertEquals("Addition failed", 5, calc.add(2, 2));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals("Subtraction failed", 0, calc.subtract(2, 2));
    }
}