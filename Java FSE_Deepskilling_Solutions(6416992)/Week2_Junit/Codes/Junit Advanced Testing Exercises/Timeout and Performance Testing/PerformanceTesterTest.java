package com.advexample.junitparamdemo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    public void testPerformTaskCompletesQuickly() {
        PerformanceTester tester = new PerformanceTester();

        // Test must complete within 1 second
        assertTimeout(Duration.ofSeconds(1), () -> {
            tester.performTask();
        });
    }
}
