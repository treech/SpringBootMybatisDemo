package com.springboot.hellworld.mapper;

import com.springboot.hellworld.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> queryUserList();

    void addUser(User user);
}
