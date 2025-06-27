package com.advexample.junitparamdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    @Test
    public void testThrowsException() {
        ExceptionThrower et = new ExceptionThrower();

        // Expect an exception when input is negative
        assertThrows(IllegalArgumentException.class, () -> {
            et.throwExceptionIfNegative(-5);
        });
    }

    @Test
    public void testNoException() {
        ExceptionThrower et = new ExceptionThrower();

        // No exception should be thrown for positive input
        assertDoesNotThrow(() -> {
            et.throwExceptionIfNegative(10);
        });
    }
}