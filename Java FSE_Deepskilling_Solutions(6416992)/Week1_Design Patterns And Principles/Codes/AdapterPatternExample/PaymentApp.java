package AdapterPatternExample;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentProcessor razorAdapter = new RazorPayAdapter();
        razorAdapter.processPayment(500.00);

        PaymentProcessor paypalAdapter = new PayPalAdapter();
        paypalAdapter.processPayment(1200.00);
    }
}

