package com.advexample.junitparamdemo;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class QuoteServiceTest {

    @Test
    public void testMultipleQuoteReturns() {
        QuoteApi mockApi = mock(QuoteApi.class);
        when(mockApi.getQuote())
            .thenReturn("Stay strong")
            .thenReturn("Keep going");

        QuoteService service = new QuoteService(mockApi);
        String result = service.fetchQuotes();

        assertEquals("Stay strong | Keep going", result);
    }
}
