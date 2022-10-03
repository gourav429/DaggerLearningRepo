
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I am cute");

        UserRegistrationComponent component = DaggerUserRegistrationComponent
                .builder()
                .build();
        UserRegistrationService userRegistrationService = component.getUserRegistrationService();
        //EmailService emailService = component.getEmailService();
        userRegistrationService.registerUser("gourav@testcode.com", "1111");
    }
}
