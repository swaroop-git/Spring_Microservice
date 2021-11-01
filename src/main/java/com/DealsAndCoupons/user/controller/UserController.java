package com.DealsAndCoupons.user.controller;

import com.DealsAndCoupons.user.entity.User;
import com.DealsAndCoupons.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {

        return userService.saveUser(user);
    }

    @GetMapping("/user")
    public List<User> fetchUserList() {
        return userService.fetchuser();

    }

    @GetMapping("/user/{id}")
    public User fetchUserById(@PathVariable("id") String userId) {
        return userService.fetchuserById(userId);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable("id") String userId) {
        userService.deleteUserById(userId);
        return "User Deleted";
    }

    @PutMapping("/user/{id}")
    public User updateUserById(@PathVariable("id") String userId, @RequestBody User user) {
        return userService.updateUserById(userId, user);

    }


//    @GetMapping("/{userId}")
//    public User getUser(@PathVariable("userId") Long userId){
//
//        return this.userService.getUser(userId);
//    }


}
