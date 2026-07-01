package jass.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testRegisterUser() {

        NotificationService mockNotification = mock(NotificationService.class);

        when(mockNotification.sendNotification())
                .thenReturn("Registration Successful!");

        UserService service = new UserService(mockNotification);

        String result = service.registerUser();

        assertEquals("Registration Successful!", result);

        verify(mockNotification).sendNotification();
    }
}