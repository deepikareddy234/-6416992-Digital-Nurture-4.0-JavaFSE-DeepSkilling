package com.advexample.junitparamdemo;

public class LogService {
    private Logger logger;

    public LogService(Logger logger) {
        this.logger = logger;
    }

    public void process() {
        // This is the void method we want to test
        logger.log("Process started");
    }
}
