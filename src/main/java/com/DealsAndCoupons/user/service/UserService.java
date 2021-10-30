package com.DealsAndCoupons.user.service;


import com.DealsAndCoupons.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public User saveUser(User user);

    public List<User> fetchuser();

    public  User fetchuserById(String _id);

    public User deleteUserById(String _id);

    public User updateUserById(String _id, User user);


}
