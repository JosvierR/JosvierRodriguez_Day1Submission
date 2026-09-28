interface NotificationService {

    void sendAlert(
        String message,
        String recipient
    );
}

class EmailNotification
        implements NotificationService {

    @Override
    public void sendAlert(
            String message,
            String recipient
    ) {

        System.out.println(
            "Email sent to "
            + recipient
            + ": "
            + message
        );
    }
}

class SMSNotification
        implements NotificationService {

    @Override
    public void sendAlert(
            String message,
            String recipient
    ) {

        System.out.println(
            "SMS sent to "
            + recipient
            + ": "
            + message
        );
    }
}

class PushNotification
        implements NotificationService {

    @Override
    public void sendAlert(
            String message,
            String recipient
    ) {

        System.out.println(
            "Push sent to "
            + recipient
            + ": "
            + message
        );
    }
}

class NotificationManager {

    private NotificationService[] services;

    public NotificationManager(
            NotificationService[] services
    ) {

        this.services = services;
    }

    public void broadcast(
            String message,
            String recipient
    ) {

        for (
            NotificationService service
            : services
        ) {

            service.sendAlert(
                message,
                recipient
            );
        }
    }
}

public class Main {

    public static void main(String[] args) {

        NotificationService[] services = {

            new EmailNotification(),

            new SMSNotification(),

            new PushNotification()
        };

        NotificationManager manager =
            new NotificationManager(
                services
            );

        manager.broadcast(
            "Your order is ready!",
            "John"
        );
    }
}
