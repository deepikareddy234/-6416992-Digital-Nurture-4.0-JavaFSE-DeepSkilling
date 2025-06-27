package com.example.exapp;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // assertEquals: checks if two values are equal
        assertEquals(5, 2 + 3);

        // assertTrue: checks if condition is true
        assertTrue(10 > 1);

        // assertFalse: checks if condition is false
        assertFalse(5 < 2);

        // assertNull: checks if value is null
        Object obj = null;
        assertNull(obj);

        // assertNotNull: checks if value is not null
        Object obj2 = new Object();
        assertNotNull(obj2);
    }
}
