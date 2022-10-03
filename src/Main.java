
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I am cute");

        UserRegistrationComponent component = DaggerUserRegistrationComponent
                .builder()
                .notificationServiceModule(new NotificationServiceModule(3))
                .build();
        UserRegistrationService userRegistrationService = component.getUserRegistrationService();
        EmailService emailService1 = component.getEmailService();
        EmailService emailService2 = component.getEmailService();
        if(emailService2 == emailService1) {
            System.out.println("Both are same");
        } else {
            System.out.println("Both are not same");
        }
        userRegistrationService.registerUser("gourav@testcode.com", "1111");
    }
}
