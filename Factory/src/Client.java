public class Client {
    public static void main(String[] args){
        //THis provides us the preferred notification channel in runtime
        NotificationType notificationType = AppConfig.getPreferredNotificationChannel();

        Notification notification = NotificationFactory.createNotification(notificationType);

        OrderService orderService = new OrderService(notification);

        orderService.placeOrder("XNJ78YE2", "Laptop");

        //If product asks to switch to PUSH or SMS tomorrow, we only need to update AppConfig/factory change.
        //OrderService remains untouched.
    }
}
