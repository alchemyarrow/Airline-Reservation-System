package JUnitTest;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.example.demo.entity.User;

public class UserTest {

    @Test
    public void testUserEntity() {
        // Create a User instance with dynamically generated values
        String username = "Arrow";
        String password = "password123";
        String role = "ROLE_USER";
        
        User user = new User();
        user.setId(1L);
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);

        // Verify that the user ID matches the expected value
        assertEquals(Long.valueOf(1), user.getId());

        // Verify that the username matches the dynamically generated value
        assertEquals(username, user.getUsername());

        // Verify that the password matches the dynamically generated value
        assertEquals(password, user.getPassword());

        // Verify that the role matches the dynamically generated value
        assertEquals(role, user.getRole());
    }
}
