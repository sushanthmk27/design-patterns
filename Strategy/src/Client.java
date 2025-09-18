public class Client {
    public static void main(String[] args){
        PaymentContext context = new PaymentContext();

        //credit card payment
        context.setStrategy(new CreditCardPay("1234-5678-9012-3456", "Sushanth", "123", "12/25"));
        context.pay(2500);

        //paypal payment
        context.setStrategy(new PayPalPay("abcd@hotmail.com", "mypassword"));
        context.pay(5000);

        //upi payment
        context.setStrategy(new UpiPay("sushanth5678@upi"));
        context.pay(1000);
    }
}
