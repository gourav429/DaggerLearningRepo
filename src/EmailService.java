import javax.inject.Inject;

interface NotificationService {
    void send(String to, String from, String body);
}
class EmailService implements NotificationService{
    @Inject
    EmailService(){};
    @Override
    public void send(String to, String from, String body) {
        System.out.println("Email Sent");
    }
}

class MessageService implements NotificationService {
    @Override
    public void send(String to, String from, String body) {
        System.out.println("Message Sent");
    }
}
