package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234567812345678"));
        context.payAmount(150.0);

        // Switch to PayPal
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.payAmount(75.0);
    }
}

