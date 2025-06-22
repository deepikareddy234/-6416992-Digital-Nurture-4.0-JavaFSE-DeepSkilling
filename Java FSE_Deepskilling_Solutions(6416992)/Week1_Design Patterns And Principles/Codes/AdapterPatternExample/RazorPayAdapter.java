package AdapterPatternExample;

public class RazorPayAdapter implements PaymentProcessor {
    private RazorPay razorPay;

    public RazorPayAdapter() {
        razorPay = new RazorPay();
    }

    public void processPayment(double amount) {
        razorPay.makePayment(amount);
    }
}
