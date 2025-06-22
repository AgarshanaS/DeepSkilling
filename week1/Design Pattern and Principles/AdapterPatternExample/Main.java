package AdapterPatternExample;

public class Main {
    public static void main(String[] args) {
        // Use PayPal via adapter
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(150.00);

        // Use Stripe via adapter
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(220.50);
    }
}
