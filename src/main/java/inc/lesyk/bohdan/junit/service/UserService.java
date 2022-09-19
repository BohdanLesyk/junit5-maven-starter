package inc.lesyk.bohdan.junit.service;

import inc.lesyk.bohdan.junit.dto.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private final List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return users;
    }

    public boolean add(User user) {
        return users.add(user);
    }
}
