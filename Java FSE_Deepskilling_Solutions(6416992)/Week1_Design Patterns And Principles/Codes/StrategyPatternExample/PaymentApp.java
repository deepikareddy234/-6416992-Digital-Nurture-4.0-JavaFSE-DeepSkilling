package StrategyPatternExample;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.processPayment(1000.0);

        context.setStrategy(new PayPalPayment());
        context.processPayment(1500.0);
    }
}

