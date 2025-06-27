package com.advexample.junitparamdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testFetchData() {
        // Step 1: Create a fake version of ExternalApi
        ExternalApi fakeApi = mock(ExternalApi.class);

        // Step 2: Tell it what to return when getData() is called
        when(fakeApi.getData()).thenReturn("Hello from mock!");

        // Step 3: Give the fake API to your service
        MyService service = new MyService(fakeApi);

        // Step 4: Call the method and check the result
        String result = service.fetchData();
        assertEquals("Hello from mock!", result);  // Should pass
    }
}
