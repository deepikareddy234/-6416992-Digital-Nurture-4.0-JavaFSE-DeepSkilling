package com.example.mockito_mock_dependencies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Create logger instance
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
    }
}

