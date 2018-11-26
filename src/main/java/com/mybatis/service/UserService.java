package com.mybatis.service;

import com.mybatis.dao.UserMapper;
import com.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;


    //注解版----不使用对象
    public void addUser(String name,int age) {
        userMapper.addUser(name,age);
    }

    public User getUserById(Integer id){
        return userMapper.getUserById(id);
    }

    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }

    public void updateUserById(Integer id, String name, int age) {
        userMapper.updateUserById(id,name,age);
    }

    //注解版----使用对象
    public void addUser2(User user){
        userMapper.addUser2(user);
    }

    public void updateUserById2(User user) {
        userMapper.updateUserById2(user);
    }

    //xml版----不使用对象
    public void addUser3(String name, int age) {
        userMapper.addUser3(name,age);
    }

    public User getUserById3(Integer id) {
       return userMapper.getUserById3(id);
    }

    public void deleteUserById3(Integer id) {
        userMapper.deleteUserById3(id);
    }

    public void updateUserById3(Integer id, String name, int age) {
        userMapper.updateUserById3(id,name,age);
    }

    //xml版----使用对象
    public void addUser4(User user) {
        userMapper.addUser4(user);
    }

    public void updateUserById4(User user) {
        userMapper.updateUserById4(user);
    }
}