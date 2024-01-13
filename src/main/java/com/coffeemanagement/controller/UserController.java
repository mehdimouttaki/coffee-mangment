package com.coffeemanagement.controller;


import com.coffeemanagement.model.Role;
import com.coffeemanagement.model.User;
import com.coffeemanagement.service.serviceImpl.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

   private final UserService userService;
   private final PasswordEncoder passwordEncoder;

    public UserController(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }


    @PostConstruct
    public void init(){
        boolean existed= userService.existByEmail("admin@gmail.com");
        if (!existed){
            User user =new User();
            user.setFirstname("Mehdi");
            user.setLastname("Mouttaki");
            user.setEmail("admin@gmail.com");
            user.setUsername("mehdi.mouttaki");
            user.setPassword(passwordEncoder.encode("123456"));
            user.setRole(Role.ADMIN);
            userService.save(user);
        }
}}
