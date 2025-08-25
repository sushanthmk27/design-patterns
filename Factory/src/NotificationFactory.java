public class NotificationFactory {

    public static Notification createNotification(NotificationType type) {
        switch (type) {
            case NotificationType.EMAIL:
                return new EmailNotification();
            case NotificationType.SMS:
                return new SmsNotification();
            case NotificationType.PUSH:
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}
