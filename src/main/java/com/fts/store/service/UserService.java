package com.fts.store.service;

import com.fts.store.entity.User;
import com.fts.store.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User postUser(User user) {
        return this.userRepository.save(user);
    }

    public User getUser(Long id) {
        return this.userRepository.findById(id).orElseThrow(()->new RuntimeException(" User Not Found !"));
    }

    public List<User> getUserAll() {
        return this.userRepository.findAll();
    }
}
