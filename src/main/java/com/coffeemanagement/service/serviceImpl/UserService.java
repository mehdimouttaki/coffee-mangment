package com.coffeemanagement.service.serviceImpl;


import com.coffeemanagement.model.User;
import com.coffeemanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User save(User user) {

        return userRepository.save(user);
    }

    public void delete(Long id) {

        userRepository.deleteById(id);
    }

    public User update(User admin) {

        return userRepository.save(admin);
    }

    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }

    public boolean existByEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}
