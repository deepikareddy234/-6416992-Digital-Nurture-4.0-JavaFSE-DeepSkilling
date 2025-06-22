package AdapterPatternExample;

public class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal;

    public PayPalAdapter() {
        payPal = new PayPal();
    }

    public void processPayment(double amount) {
        payPal.sendAmount(amount);
    }
}
