package ObserverPattern;

// Observer Interface
public interface Observer {
    void update(double stockPrice);
}

// Concrete Observer 1
class MobileApp implements Observer {
    public void update(double stockPrice) {
        System.out.println("Mobile App: Stock price updated to $" + stockPrice);
    }
}

// Concrete Observer 2
class WebApp implements Observer {
    public void update(double stockPrice) {
        System.out.println("Web App: Stock price updated to $" + stockPrice);
    }
}

