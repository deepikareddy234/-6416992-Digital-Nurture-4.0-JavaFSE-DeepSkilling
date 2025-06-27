package com.advexample.junitparamdemo;

public class PerformanceTester {
    public void performTask() {
        // Simulate time-consuming task
        try {
            Thread.sleep(800); // 800 milliseconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
