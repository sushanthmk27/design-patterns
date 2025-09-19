/*Observer interface*/
public interface StockObserver {
    void update(String stockSymbol, float stockPrice);
}
