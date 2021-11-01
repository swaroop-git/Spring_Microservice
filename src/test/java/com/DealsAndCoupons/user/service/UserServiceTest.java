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

    UserServiceImpl userServiceImplMock = mock(UserServiceImpl.class);

    @Test
    @DisplayName("Get Data based on Valid User Id")
    public void whenValidUserId_thenUserShouldFound(){
        String userId = "1";
        User found =
                userService.fetchuserById(userId);

        assertEquals(userId, found.get_id());
    }


    @Test
    @DisplayName("post Data based on Valid User Id")
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

        when(userServiceImplMock.deleteUserById("1")).thenReturn(null);
        assertEquals(null, userServiceImplMock.deleteUserById("1"));
    }





//    @Test
//    @DisplayName("update Data based on Valid User Id")
//    public void updateUserTest() {
//
//
//        String name = "swaroop";
//
//        User Updateduser = new User();
//        Updateduser.setName("Ramesh");
//
////        UserService model = (UserService) userRepository.findById("1").get();
////        model.fetchuser();
//
////        when(userService.updateUserById("1",User Updateduser)).thenReturn(Updateduser);
//
//
////        User update =
////                userService.updateUserById("1",user);
//        assertEquals(Updateduser, name ,"name updated");
//
//
//    }



}