package com.DealsAndCoupons.user.repository;

import com.DealsAndCoupons.user.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;


@Repository
public interface UserRepository extends MongoRepository<User ,String> {


}
