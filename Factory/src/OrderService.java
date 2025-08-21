/**
 * Here it depends on the Notification abstraction.
 * It does not care how the messages are sent; only that it can call send() on the Notification interface.
 */
public class OrderService {

    private final Notification notification;

    public OrderService(Notification notification){
        this.notification = notification;
    }

    public void placeOrder(String userId, String item){
        String recipientDetails = getUserDetails(userId);
        notification.send(recipientDetails, "Order placed for item: " + item);
    }

    private String getUserDetails(String userId) {
        return "User details for " + userId;
    }

}
