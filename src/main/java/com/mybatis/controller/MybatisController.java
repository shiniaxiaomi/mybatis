package com.mybatis.controller;

import com.mybatis.entity.User;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yingjie.Lu on 2018/11/26.
 */

@RestController
public class MybatisController {

    @Autowired
    UserService userService;

    //注解版----不使用对象
    @RequestMapping("/addUser")
    public void addUser(String name,int age){
        userService.addUser(name,age);
    }

    @RequestMapping("/getUserById")
    public User getUserById(Integer id){
        return userService.getUserById(id);
    }

    @RequestMapping("/deleteUserById")
    public void deleteUserById(Integer id){
        userService.deleteUserById(id);
    }

    @RequestMapping("/updateUserById")
    public void updateUserById(Integer id,String name,int age){
        userService.updateUserById(id,name,age);
    }

    //注解版----使用对象
    @RequestMapping("/addUser2")
    public void addUser2(User user){
        userService.addUser2(user);
    }

    @RequestMapping("/updateUserById2")
    public void updateUserById2(User user){
        userService.updateUserById2(user);
    }

    //xml版----不使用对象
    @RequestMapping("/addUser3")
    public void addUser3(String name,int age){
        userService.addUser3(name,age);
    }

    @RequestMapping("/getUserById3")
    public User getUserById3(Integer id){
        return userService.getUserById3(id);
    }

    @RequestMapping("/deleteUserById3")
    public void deleteUserById3(Integer id){
        userService.deleteUserById3(id);
    }

    @RequestMapping("/updateUserById3")
    public void updateUserById3(Integer id,String name,int age){
        userService.updateUserById3(id,name,age);
    }

    //xml版----使用对象
    @RequestMapping("/addUser4")
    public void addUser4(User user){
        userService.addUser4(user);
    }

    @RequestMapping("/updateUserById4")
    public void updateUserById4(User user){
        userService.updateUserById4(user);
    }


}
