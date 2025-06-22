package AdapterPatternExample;

public class PayPal {
    public void sendAmount(double amt) {
        System.out.println("PayPal processed ₹" + amt);
    }
}
