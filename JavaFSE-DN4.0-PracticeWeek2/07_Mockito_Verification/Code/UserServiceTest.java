import org.junit.Test;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testNotificationIsSent() {
        NotificationService mockNotify = mock(NotificationService.class);

        UserService userService = new UserService(mockNotify);
        userService.registerUser("Harshini");

        // Verify that notification is sent once with correct params
        verify(mockNotify).sendNotification("Harshini", "Welcome Harshini!");
        verify(mockNotify, times(1)).sendNotification("Harshini", "Welcome Harshini!");
    }
}


