package com.gaucimaistre.rssthenews.controller;

import com.gaucimaistre.rssthenews.model.User;
import com.gaucimaistre.rssthenews.model.UserDto;
import com.gaucimaistre.rssthenews.repository.UserRepository;
import org.springframework.context.annotation.Role;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;

public class UserController {
    UserRepository userRepository;

    @PostMapping("/register")
    public String register(UserDto userDto) {
        User user = new User(
                userDto.getUsername(),
                userDto.getEmail(),
                passwordEncoder.encode(userDto.getPassword())
        );

        user.setRoles(Collections.singleton(Role.USER));
        userRepository.save(user);
        return "redirect:/login";
    }
}
