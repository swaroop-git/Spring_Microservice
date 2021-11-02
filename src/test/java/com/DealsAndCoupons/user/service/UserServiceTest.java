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

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

//    @BeforeEach
//    void setUp() {
//        User user =
//                User.builder()
//                        ._id("2")
//                        .name("swaroop")
//                        .email("swaroop@gmail.com")
//                        .build();
//
//        when(userRepository.findById("2"))
//                .thenReturn(java.util.Optional.ofNullable(user));
//    }

    UserServiceImpl userServiceImplMock = mock(UserServiceImpl.class);

    @Test
    @DisplayName("Test for getting user by Id")
    public void whenValidUserId_thenUserShouldFound(){
//        String userId = "2";
        User user1 = new User();
        user1.set_id("1");
        user1.setName("susu Rastogi");
        user1.setEmail("susu@gmail.com");
//        User found =
//                userService.fetchuserById("1");
        when(userServiceImplMock.fetchuserById("1"))
               .thenReturn(user1);

        assertEquals(user1,userServiceImplMock.fetchuserById("1"));
    }


    @Test
    @DisplayName("Test for posting user by Id")
    public void postuser(){

        User user = new User();
        user.setName("Raju Rastogi");
        user.setEmail("Raju@gmail.com");

        User user1 = new User();
        user1.setName("Farhan ");
        user1.setEmail("Farhan@gmail.com");



        when(userServiceImplMock.saveUser(user)).thenReturn(user);
		assertEquals(user, userServiceImplMock.saveUser(user));

        when(userServiceImplMock.saveUser(user1)).thenReturn(user1);
        assertEquals(user1, userServiceImplMock.saveUser(user1));


    }

//    @Test
//	public void getUsersTest(){
//
//        User user = new User();
//        user.setName("Raju Rastogi");
//        user.setEmail("Raju@gmail.com");
//
//        User user1 = new User();
//        user1.setName("Farhan ");
//        user1.setEmail("Farhan@gmail.com");
//
//        List<User> lu = new List<User>() {
//
//
//        };
//
//        lu.set(0,user);
//        lu.set(1,user1);
//
//		when(userService.fetchuser()).thenReturn(lu);
//		assertEquals(1,userService
//                .fetchuser().size());
//	}

    @Test
    @DisplayName("Test for findAllUser")
    public void findAllUserTest(){
        when(userServiceImplMock.fetchuser()).thenReturn(Stream
                .of(new User("1", "rancho", "rancho@gmail.com"), new User("2", "chotu", "chotu@gmail.com"))
                .collect(Collectors.toList()));
        assertEquals(2, userServiceImplMock.fetchuser().size());
    }



    @Test
    @DisplayName("Test for deleting User by Id")
    public void deleteUserTest(){


        User user = new User();
        user.set_id("1");
        user.setName("Raju Rastogi");
        user.setEmail("Raju@gmail.com");

        when(userServiceImplMock.deleteUserById("1")).thenReturn("user deleted");
        assertEquals("user deleted", userServiceImplMock.deleteUserById("1"));
    }



    @Test
    @DisplayName("Test for updating user")
    public void updateUserTest(){

        User user = new User();
        user.set_id("1");
        user.setName("Raju Rastogi");
        user.setEmail("Raju@gmail.com");


        User user1 = new User();
//        user1.set_id("1");
        user1.setName("farhan");
        user1.setEmail("farhan@gmail.com");

        User user2 = new User();

        user2.set_id("1");
        user2.setName("farhan");
        user2.setEmail("farhan@gmail.com");


        User user3 = new User();

        user3.set_id("3");
        user3.setName("farhan");
        user3.setEmail("farhan@gmail.com");


        when(userServiceImplMock.updateUserById("1",user1)).thenReturn(user2);
        assertEquals(user2, userServiceImplMock.updateUserById("1",user1));
    }




}