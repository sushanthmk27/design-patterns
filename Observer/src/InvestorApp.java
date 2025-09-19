/*Concrete observer*/
public class InvestorApp implements StockObserver{
    private String investorName;

    public InvestorApp(String investorName) {
        this.investorName = investorName;
    }

    @Override
    public void update(String stockSymbol, float stockPrice) {
        System.out.println("Investor " + investorName + " notified: " + stockSymbol + " price changed to " + stockPrice);
    }
}
