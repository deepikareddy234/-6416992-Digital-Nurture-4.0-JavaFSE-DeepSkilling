package com.advexample.junitparamdemo;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

public class MessageServiceTest {

    @Test
    public void testSendMessageWithArgument() {
        // Step 1: Create mock object
        MessageSender mockSender = mock(MessageSender.class);

        // Step 2: Inject mock into service
        MessageService service = new MessageService(mockSender);

        // Step 3: Call method with specific argument
        service.sendMessageToCity("Hyderabad");

        // Step 4: Verify method was called with "Hyderabad"
        verify(mockSender).send(eq("Hyderabad"));
    }
}

