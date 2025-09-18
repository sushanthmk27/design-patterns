/*Concrete strategy classes*/
public class UpiPay implements PaymentStrategy {
    private String upiId;

    public UpiPay(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}
