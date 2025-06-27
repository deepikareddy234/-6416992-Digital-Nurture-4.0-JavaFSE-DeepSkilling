package com.advexample.junitparamdemo;

public class QuoteService {
    private QuoteApi quoteApi;

    public QuoteService(QuoteApi quoteApi) {
        this.quoteApi = quoteApi;
    }

    public String fetchQuotes() {
        String q1 = quoteApi.getQuote();
        String q2 = quoteApi.getQuote();
        return q1 + " | " + q2;
    }
}
