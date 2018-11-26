package com.mybatis.dao;

import com.mybatis.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    //注解版----不使用对象
    @Insert("insert into user (name,age) values(#{name},#{age})")//如果是自增主键则不用管id
    int addUser(@Param("name") String name,@Param("age") int age);

    @Select("select * from user where id=#{id}")
    User getUserById(Integer id);//如果只有一个参数的话就可以不使用@Param注解表明

    @Delete("delete from user where id=#{id}")
    int deleteUserById(@Param("id") Integer id);

    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    void updateUserById(@Param("id")Integer id,@Param("name")String name,@Param("age")Integer age);

    //注解版----使用对象
    @Insert("insert into user (name,age) values(#{name},#{age})")//如果是自增主键则不用管id
    int addUser2(User user);

    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    void updateUserById2(User user);

    //xml版----不使用对象
    int addUser3(@Param("name") String name,@Param("age") int age);

    User getUserById3(Integer id);//如果只有一个参数的话就可以不使用@Param注解表明

    int deleteUserById3(@Param("id") Integer id);

    void updateUserById3(@Param("id")Integer id,@Param("name")String name,@Param("age")Integer age);

    //xml版----使用对象(使用对象就可以不使用@Param来指定参数)
    int addUser4(User user);

    void updateUserById4(User user);
}