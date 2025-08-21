public class EmailNotification implements Notification {

    private boolean enabled;

    @Override
    public void send(String recipient, String message) {
        if (enabled) {
            System.out.println("Sending email notification: " + message);
        } else {
            System.out.println("Email notifications are disabled.");
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
