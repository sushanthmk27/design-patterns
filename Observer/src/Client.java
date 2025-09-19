public class Client {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        StockObserver broker1 = new BrokerPortal("Broker A");
        StockObserver broker2 = new BrokerPortal("Broker B");
        StockObserver trader1 = new TraderSystem("Trader X");
        StockObserver trader2 = new TraderSystem("Trader Y");
        StockObserver inveestorApp = new InvestorApp("Sushanth");

        stockMarket.register(broker1);
        stockMarket.register(broker2);
        stockMarket.register(trader1);
        stockMarket.register(trader2);
        stockMarket.register(inveestorApp);

        stockMarket.setStockPrice(150.0f , "AAPL");
        stockMarket.setStockPrice(2800.0f, "GOOGL");

        stockMarket.unregister(broker2);
        stockMarket.setStockPrice(155.0f, "AAPL");

    }
}
