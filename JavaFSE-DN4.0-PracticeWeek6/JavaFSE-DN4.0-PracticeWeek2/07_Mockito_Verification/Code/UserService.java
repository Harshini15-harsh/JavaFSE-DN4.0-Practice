public class UserService {
    private NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser(String user) {
        // Simulate user registration
        System.out.println("User registered: " + user);
        notificationService.sendNotification(user, "Welcome " + user + "!");
    }
}
