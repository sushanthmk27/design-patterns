/*Concrete observer*/
public class TraderSystem implements StockObserver{
    private String traderName;

    public TraderSystem(String traderName) {
        this.traderName = traderName;
    }

    @Override
    public void update(String stockSymbol, float stockPrice) {
        System.out.println("Trader " + traderName + " notified: " + stockSymbol + " price changed to " + stockPrice);
    }
}
