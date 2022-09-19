package inc.lesyk.bohdan.junit.service;

import inc.lesyk.bohdan.junit.dto.User;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class UserServiceTest {
    private UserService userService;

    @BeforeAll
    static void init() {
        System.out.println("Before all: ");
    }

    @BeforeEach
    void prepare() {
        System.out.println("Before each:  " + this);
        userService = new UserService();
    }

    @Test
    void firstJavaTest() {
        System.out.println("Test 1: " + this);
        Assertions.assertFalse(false);
        Assertions.assertTrue(true);
    }

    @Test
    void testUsersEmptyIfNoOneAdded() {
        System.out.println("Test 2: " + this);
        var users = userService.getAllUsers();

        Assertions.assertTrue(users.isEmpty());
        Assertions.assertFalse(!users.isEmpty(), "Users list should be empty");
    }

    @Test
    void usersSizeAfterUsedAdded() {
        System.out.println("Test 3: " + this);
        var userService = new UserService();
        userService.add(new User());
        userService.add(new User());

        var users = userService.getAllUsers();
        Assertions.assertEquals(2, users.size() );
    }

    @AfterEach
    void deleteDataFromDatabase() {
        System.out.println("After each: " + this);
    }

    @AfterAll
    static void closeConnectionPool() {
        System.out.println("After all: ");
    }
}
