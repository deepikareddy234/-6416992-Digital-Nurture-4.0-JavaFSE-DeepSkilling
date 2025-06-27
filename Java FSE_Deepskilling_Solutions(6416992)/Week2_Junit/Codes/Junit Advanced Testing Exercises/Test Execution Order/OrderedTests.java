package com.advexample.junitparamdemo;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(3)
    public void testC() {
        System.out.println("Running test C");
        assertTrue(true);
    }

    @Test
    @Order(1)
    public void testA() {
        System.out.println("Running test A");
        assertTrue(true);
    }

    @Test
    @Order(2)
    public void testB() {
        System.out.println("Running test B");
        assertTrue(true);
    }
}
