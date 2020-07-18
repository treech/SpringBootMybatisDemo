package com.springboot.hellworld.controller;

import com.springboot.hellworld.entity.User;
import com.springboot.hellworld.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyBatisController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "/queryUserList")
    @ResponseBody
    public List<User> queryUserList() {
        System.out.println("queryUserList");
        List<User> users = userMapper.queryUserList();
        return users;
    }

    @PostMapping(value = "/addUser")
    @ResponseBody
    public String addUser(@RequestBody User user) {
        userMapper.addUser(user);
        return "Ok";
    }

    @RequestMapping(value = "/testUrl", method = RequestMethod.GET)
    @ResponseBody
    public String testUrl() {
        return "testUrl response";
    }
}
