package com.example.mockito_mock_dependencies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderLoggingDemo {

    private static final Logger logger = LoggerFactory.getLogger(OrderLoggingDemo.class);

    public static void main(String[] args) {
        String customerName = "Aarav";
        int orderId = 56789;
        double amount = 1250.75;

        logger.info("Received order {} from customer {}", orderId, customerName);
        logger.debug("Order {} has a total amount of {}", orderId, amount);
        logger.warn("Order {} for customer {} is taking longer than expected", orderId, customerName);
        logger.error("Error occurred while processing order {} for customer {}", orderId, customerName);

        System.out.println("Check console for the log output.");
    }
}
