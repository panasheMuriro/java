package com.muriro.spring_boot_1.service;
import com.muriro.spring_boot_1.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return users;
    }

    public Optional<User> getUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public User createUser(User user) {
        user.setId((long) (users.size() + 1)); // Simple ID generation
        users.add(user);
        return user;
    }

    public Optional<User> updateUser(Long id, User userDetails) {
        return getUserById(id).map(user -> {
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
            return user;
        });
    }

    public boolean deleteUser(Long id) {
        return users.removeIf(user -> user.getId().equals(id));
    }

}
