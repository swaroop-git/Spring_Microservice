package com.DealsAndCoupons.user;

import com.DealsAndCoupons.user.entity.User;
import com.DealsAndCoupons.user.repository.UserRepository;
import com.DealsAndCoupons.user.service.UserService;
import com.DealsAndCoupons.user.service.UserServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class UserServiceApplicationTests {

//	@Autowired
//	private UserService service;
//
//	@MockBean
//	private UserRepository repository;

//	@Test
//	public void getUsersTest(){
//		when(repository.findAll()).thenReturn(Stream.of(new User("11", "swaroop","swaroop@gmail.com")),(new User("22" ,"jake" ,"jake@gmail.com")).collect(Collectors.toList()));
//		assertEquals(1,service.fetchuser().size());
//	}

//	@Test
//	@DisplayName("Test for adding user")
//	public void adduserTest() {

//		UserServiceImpl userServiceImplMock = mock(UserServiceImpl.class);
//
//		when(userServiceImplMock.saveUser("swaroop", "swaroop@gmail.com")).thenReturn("Successfully added");
//		assertEquals("Successfully added", userServiceImplMock.saveUser("Swaroop", "swaroop@gmail.com"));
	}


