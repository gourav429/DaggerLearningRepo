import javax.inject.Inject;
import javax.inject.Singleton;

interface NotificationService {
    void send(String to, String from, String body);
}

@Singleton
class EmailService implements NotificationService{
    @Inject
    EmailService(){};
    @Override
    public void send(String to, String from, String body) {
        System.out.println("Email Sent");
    }
}

class MessageService implements NotificationService {

    private int retryCount;
    MessageService(int retryCount) {
        this.retryCount = retryCount;
    }
    @Override
    public void send(String to, String from, String body) {
        System.out.println("Message Sent - retry count "+ retryCount);
    }
}
