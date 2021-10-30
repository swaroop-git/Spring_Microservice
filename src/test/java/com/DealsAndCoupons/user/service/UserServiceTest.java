package com.DealsAndCoupons.user.service;

import com.DealsAndCoupons.user.entity.User;
import com.DealsAndCoupons.user.repository.UserRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        User user =
                User.builder()
                        ._id("1")
                        .name("swaroop")
                        .email("swaroop@gmail.com")
                        .build();

        when(userRepository.findById("1"))
                .thenReturn(java.util.Optional.ofNullable(user));
    }

    @Test
    @DisplayName("Get Data based on Valid User Id")
    public void whenValidUserId_thenUserShouldFound(){
        String userId = "1";
        User found =
                userService.fetchuserById(userId);

        assertEquals(userId, found.get_id());
    }




//    @Test
//    @DisplayName("update Data based on Valid User Id")
//    public void updateUserTest() {
//
//        User user = new User();
//        user.setName("Ramesh");
//
//        User update =
//                userService.updateUserById("1",user);
//        assertEquals(user, update.getName());
//    }



}