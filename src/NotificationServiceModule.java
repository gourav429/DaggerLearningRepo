import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class NotificationServiceModule {
    int retryCount;
    public NotificationServiceModule(int retryCount) {
        this.retryCount = retryCount;
    }
    @Singleton
    @MessageQualifier
    @Provides
    public NotificationService getMessageService() {
        return new MessageService(retryCount);
    }

    @Named("email")
    @Provides
    public NotificationService getEmailService(EmailService emailService) {
        return emailService;
    }
}
