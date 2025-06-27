package com.advexample.junitparamdemo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    @Test
    public void testAdd() {
        CalculatorService service = new CalculatorService();
        int result = service.add(5, 7);
        assertEquals(12, result, "5 + 7 should equal 12");
    }
}
