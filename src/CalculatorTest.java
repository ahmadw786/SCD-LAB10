import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.add(5, 3);
        assertEquals(8, result, 0.0001); // The third parameter is the delta for double comparison
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(7, 4);
        assertEquals(3, result, 0.0001);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(4, 6);
        assertEquals(24, result, 0.0001);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 2);
        assertEquals(5, result, 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        // For division by zero, the expected behavior is to return Double.POSITIVE_INFINITY
        double result = calculator.divide(5, 0);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.0001);
    }
}
