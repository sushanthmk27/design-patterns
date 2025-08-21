public interface Notification {
    /**
     * Sends a notification with the specified message.
     *
     * @param recipient recipient of the message.
     * @param message The message to be sent in the notification.
     */
    void send(String recipient, String message);

    /**
     * Checks if the notification is enabled.
     *
     * @return true if the notification is enabled, false otherwise.
     */
    boolean isEnabled();

    /**
     * Sets the enabled state of the notification.
     *
     * @param enabled true to enable the notification, false to disable it.
     */
    void setEnabled(boolean enabled);
}
