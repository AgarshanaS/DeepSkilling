package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Simulate stock price changes
        stockMarket.setStockPrice(120.5);
        stockMarket.setStockPrice(125.75);

        // Unregister the web app
        stockMarket.removeObserver(webApp);

        // Another stock price change
        stockMarket.setStockPrice(130.0);
    }
}

