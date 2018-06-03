package com.chowers.jobs.blog.service;


import com.chowers.jobs.blog.model.User;
import java.util.Optional;

public interface UserService {

    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    User save(User user);
}
