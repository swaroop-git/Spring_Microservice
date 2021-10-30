package com.DealsAndCoupons.user.entity;

import lombok.*;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Document("users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String _id;
    private String name;
    private String email;

//
//    public String get_id() {
//        return _id;
//    }
//
//    public void set_id(String _id) {
//        this._id = _id;
//    }
//
//    public String getname() {
//        return name;
//    }
//
//    public void setname(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email = email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public User(String _id, String name, String email){
//        this._id = _id;
//        this.name = name;
//        this.email= email;
//    }
//
//    public User(){super();
//    }
//    public int getUserId() {
//        return Integer.parseInt(_id);
//    }
////
//    public User(String userId, String name, String email){
//        this._id =_id;
//        this.name = name;
//        this.email= email;
//    }
//
//
//
//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

//    @Override
//    public String toString() {
//
//        return "User [userId=" + _id + ", name" + name + ", email=" + email + "]";
//    }
}
