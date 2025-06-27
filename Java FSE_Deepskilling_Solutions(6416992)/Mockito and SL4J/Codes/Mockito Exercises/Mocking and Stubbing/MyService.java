package com.advexample.junitparamdemo;

public class MyService {

    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        // This will call the API to get data
        return externalApi.getData();
    }
}
