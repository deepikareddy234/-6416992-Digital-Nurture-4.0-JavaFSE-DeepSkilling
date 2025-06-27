package com.example.mockito_mock_dependencies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderProcessingDemo {

    private static final Logger logger = LoggerFactory.getLogger(OrderProcessingDemo.class);

    public static void main(String[] args) {

        String customer = "Ishaan";
        int orderId = 98765;
        double amount = 3500.50;

        logger.info("Processing order {} for customer {}", orderId, customer);
        logger.debug("Order amount: {}", amount);

        try {
            simulateOrderProcessing(orderId);
        } catch (Exception e) {
            logger.error("Error processing order {}: {}", orderId, e.getMessage());
        }

        logger.warn("Order {} is taking longer than expected", orderId);

        System.out.println("Check console and logs/application.log for output.");
    }

    private static void simulateOrderProcessing(int orderId) throws Exception {
        if (orderId % 2 == 1) {
            throw new Exception("Simulated processing error");
        }
    }
}
