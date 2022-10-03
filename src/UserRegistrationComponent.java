import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {NotificationServiceModule.class, UserRepositoryModule.class})
public interface UserRegistrationComponent {
    UserRegistrationService getUserRegistrationService();

    EmailService getEmailService();
}
