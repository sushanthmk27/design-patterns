public class ClientEcomm {
    public static void main(String[] args) {
        PaymentGateway razorPay = new RazorPay();
        razorPay.processPayment(6700);

        PaypalApi payPalApi = new PaypalApi();
        PaymentGateway payPalAdapter = new PayPalAdapter(payPalApi);
        payPalAdapter.processPayment(9100);
    }
}
