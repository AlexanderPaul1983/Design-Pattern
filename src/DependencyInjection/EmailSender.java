package DependencyInjection;

public class EmailSender implements Notification{
    @Override
    public void sendNotification(String where, String massage) {
        System.out.println("I send a " + massage + " zu " + where + ". Per Email!");
    }
}
