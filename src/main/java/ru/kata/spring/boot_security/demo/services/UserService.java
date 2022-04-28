package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.Set;

public interface UserService extends UserDetailsService {

    Set<User> allUsers();

    void saveUser(User user);

    void deleteUserById(Long id);

    User userById(Long id);

    User userByUsername(String username);

    void updateUser(User user);
}
