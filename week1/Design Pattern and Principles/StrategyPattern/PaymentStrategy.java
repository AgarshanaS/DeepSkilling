package StrategyPattern;

// Strategy Interface
public interface PaymentStrategy {
    void pay(double amount);
}

// Concrete Strategy: Credit Card
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card ending with " +
                cardNumber.substring(cardNumber.length() - 4));
    }
}

// Concrete Strategy: PayPal
class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal account: " + email);
    }
}
