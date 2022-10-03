import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class NotificationServiceModule {
    @MessageQualifier
    @Provides
    public NotificationService getMessageService() {
        return new MessageService();
    }

    @Named("email")
    @Provides
    public NotificationService getEmailService(EmailService emailService) {
        return emailService;
    }
}
