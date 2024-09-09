package DependencyInjection;

public class NotificationSender {
    Notification notification;

    public NotificationSender(Notification notification){
        this.notification = notification;
    }
    public void sendNotificationValidation( String where, String massage){
        this.notification.sendNotification(where, massage);
    }
}
