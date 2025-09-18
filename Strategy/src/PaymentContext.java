/*Context class accessed by the client to set the required strategy during runtime*/
public class PaymentContext {
    private PaymentStrategy strategy;

    /*This method is used to the strategy at runtime by the client*/
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount){
        if(strategy == null){
            throw new IllegalArgumentException("Strategy is null");
        }
        strategy.pay(amount);
    }
}
