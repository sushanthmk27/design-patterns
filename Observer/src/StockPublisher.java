/*Publisher interface*/
public interface StockPublisher {
    void register(StockObserver so);
    void unregister(StockObserver so);
    void notifyStockObservers();
}
