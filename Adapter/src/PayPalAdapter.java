public class PayPalAdapter implements PaymentGateway{

    private PaypalApi payPal;

    public PayPalAdapter(PaypalApi payPal){
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        double amountInRupees = convertToUSD(amount);
        payPal.makePaymentPaypal(amountInRupees);
    }

    private double convertToUSD(double amtInDollars){
        //Assuming a conversion rate of 1 USD = 85 INR
        return amtInDollars / 85.0;
    }
}
