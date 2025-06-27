package com.advexample.junitparamdemo;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class AlertServiceTest {

    @Test
    public void testVoidMethodThrowsException() {
        Notifier mockNotifier = mock(Notifier.class);
        doThrow(new RuntimeException("Alert failed")).when(mockNotifier).alert("Fire");

        AlertService service = new AlertService(mockNotifier);

        assertThrows(RuntimeException.class, () -> service.triggerAlert("Fire"));
        verify(mockNotifier).alert("Fire");
    }
}
