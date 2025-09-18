/*Concrete strategy classes*/
public class PayPalPay implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPay(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
