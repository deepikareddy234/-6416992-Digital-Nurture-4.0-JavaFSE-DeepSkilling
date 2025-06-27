package com.advexample.junitparamdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testSum() {
        assertEquals(7, 3 + 4);
    }

    @Test
    public void testProduct() {
        assertEquals(12, 3 * 4);
    }
}
