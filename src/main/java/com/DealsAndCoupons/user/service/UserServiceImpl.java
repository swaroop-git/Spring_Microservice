package com.DealsAndCoupons.user.service;

import com.DealsAndCoupons.user.entity.User;
import com.DealsAndCoupons.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    UserRepository userRepository;


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> fetchuser() {
        // TODO Auto-generated method stub
        return userRepository.findAll();
    }



    @Override
    public User fetchuserById(String _id) {
        // TODO Auto-generated method stub
        return userRepository.findById(_id).get();

    }

    @Override
    public User deleteUserById(String _id) {
        // TODO Auto-generated method stub
        userRepository.deleteById(_id);
        return null;
    }


    @Override
    public User updateUserById(String userId, User user) {
        User usDB = userRepository.findById(userId).get();

        if (Objects.nonNull(user.getName()) && !"".equalsIgnoreCase(user.getName())) {
            usDB.setName((user.getName()));
        }

        if (Objects.nonNull(user.getEmail())
                && !"".equalsIgnoreCase(user.getEmail())) {
            usDB.setEmail(user.getEmail());
        }

        return userRepository.save(usDB);
    }

}
