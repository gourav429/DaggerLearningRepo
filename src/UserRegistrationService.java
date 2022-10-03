import javax.inject.Inject;
import javax.inject.Named;

public class UserRegistrationService {
    private UserRepository userRepository;
    private NotificationService notificationService;


    @Inject
    public UserRegistrationService(UserRepository userRepository,@MessageQualifier NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(String email, String password) {
        userRepository.saveUser(email, password);
        notificationService.send(email, "no-reply@testcode.com", "User Registered");
    }
}
