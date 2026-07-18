class Notification {
    void sendNotification() {
        System.out.println("Sending Notification");
    }
}

class EmailNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("Sending SMS Notification");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Notification n;
        n = new EmailNotification();
        n.sendNotification();
        n = new SMSNotification();
        n.sendNotification();
    }
}
s