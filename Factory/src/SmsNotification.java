public class SmsNotification implements Notification {

    private boolean enabled;

    @Override
    public void send(String recipient, String message) {
        if (enabled) {
            System.out.println("Sending SMS notification: " + message);
        } else {
            System.out.println("SMS notifications are disabled.");
        }
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
