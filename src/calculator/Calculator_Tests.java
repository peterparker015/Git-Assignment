package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Calculator_Tests {

    @Test
    public void testAdd() {
        assertEquals(5.0, Calculator.add(2.0, 3.0));
        assertEquals(-1.0, Calculator.add(2.0, -3.0));
        
    }

    @Test
    public void testSubtract() {
        assertEquals(-1.0, Calculator.subtract(2.0, 3.0));
        assertEquals(5.0, Calculator.subtract(2.0, -3.0));
        
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, Calculator.multiply(2.0, 3.0));
        assertEquals(-6.0, Calculator.multiply(2.0, -3.0));
        
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, Calculator.divide(6.0, 3.0));
        assertEquals(-2.0, Calculator.divide(6.0, -3.0));
        
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(5.0, 0.0);
        });
    }
}