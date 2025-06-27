package com.advexample.junitparamdemo;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class LogServiceTest {

    @Test
    public void testVoidMethodCalled() {
        // Step 1: Create mock object
        Logger mockLogger = mock(Logger.class);

        // Step 2: Stub the void method (optional, only if it throws)
        doNothing().when(mockLogger).log("Process started");

        // Step 3: Inject mock into service
        LogService service = new LogService(mockLogger);

        // Step 4: Call the method
        service.process();

        // Step 5: Verify that the void method was called
        verify(mockLogger).log("Process started");
    }
}
