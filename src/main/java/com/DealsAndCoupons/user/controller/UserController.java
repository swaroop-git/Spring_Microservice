package com.DealsAndCoupons.user.controller;

import com.DealsAndCoupons.user.entity.DealsandCoupons;
import com.DealsAndCoupons.user.entity.User;
import com.DealsAndCoupons.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("")
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
       return userService.deleteUserById(userId);
//        return "User Deleted";
    }

    @PutMapping("/user/{id}")
    public User updateUserById(@PathVariable("id") String userId, @RequestBody User user) {
        return userService.updateUserById(userId, user);

    }


    @Autowired
    private RestTemplate restTemplate;
    private String BASE_URI = "http://DEALSANDCOUPONS-SERVICE";
    @GetMapping("/deals")
    public List<DealsandCoupons> fetchDealsAndCouponsList() {
        String uri = BASE_URI + "/deals";
        List<DealsandCoupons> response = restTemplate.getForObject(uri,List.class);
        return response;
    }
//    @GetMapping("/{userId}")
//    public User getUser(@PathVariable("userId") Long userId){
//
//        return this.userService.getUser(userId);
//    }

//    @GetMapping("/{_id}")
//    public ResponseTemplate getUserWithD_Cservice(@PathVariable("_id") String _id){
////        log.info("Inside getUserwithD_Cservice of usercontroller");
//        return userService.getUserWithD_Cservice(_id);
//    }

}
