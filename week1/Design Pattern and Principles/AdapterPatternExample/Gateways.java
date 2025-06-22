package AdapterPatternExample;

// Adaptee 1: PayPal
class PayPalGateway {
    public void sendPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal.");
    }
}

// Adaptee 2: Stripe
class StripeGateway {
    public void makePayment(double value) {
        System.out.println("Processing payment of $" + value + " via Stripe.");
    }
}

// Adapter for PayPal
class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway paypal;

    public PayPalAdapter(PayPalGateway paypal) {
        this.paypal = paypal;
    }

    public void processPayment(double amount) {
        paypal.sendPayment(amount);
    }
}

// Adapter for Stripe
class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripe;

    public StripeAdapter(StripeGateway stripe) {
        this.stripe = stripe;
    }

    public void processPayment(double amount) {
        stripe.makePayment(amount);
    }
}

