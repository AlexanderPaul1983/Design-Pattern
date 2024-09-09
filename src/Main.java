import DependencyInjection.EmailSender;
import DependencyInjection.Notification;
import DependencyInjection.NotificationSender;
import DependencyInjection.SMSender;
import Observer_Pattern.Handy;
import Observer_Pattern.Observer;
import Observer_Pattern.WetterStation;
import Observer_Pattern.ZugspitzeStation;
import Singleton.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        Notification sms = new SMSender();
        Notification email = new EmailSender();
        NotificationSender notificationSender = new NotificationSender(sms);
        NotificationSender notPerEmial = new NotificationSender(email);
        notificationSender.sendNotificationValidation("015765212568", "Hallo!");
        notPerEmial.sendNotificationValidation("alexander@gmx.de", "Hallo per email");
    }
}