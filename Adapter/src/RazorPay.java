//Existing RazorPay gateway class
public class RazorPay implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of ₹" + amount +" via Razorpay");
    }
}
