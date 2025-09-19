/*Concrete Observer*/
public class BrokerPortal implements StockObserver{
    private String brokerName;

    public BrokerPortal(String brokerName) {
        this.brokerName = brokerName;
    }

    @Override
    public void update(String stockSymbol, float stockPrice) {
        System.out.println("Broker " + brokerName + " notified: " + stockSymbol + " price changed to " + stockPrice);
    }
}
