import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {NotificationServiceModule.class, UserRepositoryModule.class})
public interface UserRegistrationComponent {
    UserRegistrationService getUserRegistrationService();

    //NotificationService getNotificationService();

//    @Component.Builder
//    interface Factory{
//        UserRegistrationComponent build();
//        @BindsInstance UserRegistrationComponent create(int retryCount);
//    }
}
