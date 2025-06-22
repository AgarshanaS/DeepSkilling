package DecoratorPattern;

public interface Notifier {
    void send(String message);
}

// Concrete Component
class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

