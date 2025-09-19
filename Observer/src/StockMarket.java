import java.util.ArrayList;
import java.util.List;

/*Concrete Publisher class with business logic*/
public class StockMarket implements StockPublisher{
    private List<StockObserver> observers = new ArrayList<>();
    private float stockPrice;
    private String stockSymbol;

    @Override
    public void register(StockObserver so) {
        observers.add(so);
    }

    @Override
    public void unregister(StockObserver so) {
        observers.remove(so);
    }

    @Override
    public void notifyStockObservers() {
        for(StockObserver so : observers){
            so.update(stockSymbol, stockPrice);
        }
    }

    public void setStockPrice(float price, String symbol){
        this.stockPrice = price;
        this.stockSymbol = symbol;
        System.out.println("Stock market updated: " + symbol + " new price is " + price);
        notifyStockObservers();
    }
}
