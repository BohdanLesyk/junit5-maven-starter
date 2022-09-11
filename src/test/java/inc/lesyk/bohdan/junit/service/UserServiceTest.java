package inc.lesyk.bohdan.junit.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserServiceTest {
    @Test
    void firstJavaTest() {
        Assertions.assertFalse(false);
        Assertions.assertTrue(true);
    }

    @Test
    void testUsersEmptyIfNoOneAdded() {
        var userService = new UserService();
        var users = userService.getAllUsers();

        Assertions.assertTrue(users.isEmpty());
        Assertions.assertFalse(!users.isEmpty(), "Users list should be empty");
    }
}
