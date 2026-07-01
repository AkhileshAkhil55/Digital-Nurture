package test.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator cal = new Calculator();

        int result = cal.add(5, 3);

        assertEquals(8, result);
    }

    @Test
    void testMultiplication() {
        Calculator cal = new Calculator();

        int result = cal.multiply(4, 5);

        assertEquals(20, result);
    }
}