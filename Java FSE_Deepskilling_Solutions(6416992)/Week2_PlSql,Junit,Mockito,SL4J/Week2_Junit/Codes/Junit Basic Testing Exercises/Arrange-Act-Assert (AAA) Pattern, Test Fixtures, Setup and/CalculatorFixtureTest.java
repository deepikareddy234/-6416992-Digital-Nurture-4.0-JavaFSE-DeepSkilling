package com.example.exapp;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorFixtureTest {

    private Calculator calculator;

    // Setup method – runs before every test
    @Before
    public void setUp() {
        // Arrange: Create a fresh Calculator object before each test
        calculator = new Calculator();
        System.out.println("Setup done");
    }

    // Teardown method – runs after every test
    @After
    public void tearDown() {
        // Cleanup after test (if needed)
        calculator = null;
        System.out.println("Teardown done");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(3, 2);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(7, 4);
        assertEquals(3, result);
    }

    @Test
    public void testDivisionByZeroException() {
        try {
            calculator.divide(10, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }
}
