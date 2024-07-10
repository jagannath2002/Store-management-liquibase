package com.fts.store.controller;

import com.fts.store.entity.User;
import com.fts.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User postUser(@RequestBody User user){
        return this.userService.postUser(user);
    }
    @GetMapping("/read/{id}")
    public User getUser(@PathVariable Long id){
        return this.userService.getUser(id);
    }
    @GetMapping("read/all")
    public List<User> getUserAll(){
        return this.userService.getUserAll();
    }

}
