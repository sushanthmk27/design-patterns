public class AppConfig {

    /** This method returns the preferred notification channel for the application.
     *In this case, it returns EMAIL as the preferred channel.
     *Currently we have hardcoded the values. We can also fetch this from a configuration file or database for the value to be fetched in runtime.
     */
    public static NotificationType getPreferredNotificationChannel(){
        return NotificationType.EMAIL;
    }
}
