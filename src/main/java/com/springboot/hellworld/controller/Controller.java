package com.springboot.hellworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        System.out.println("调用hello接口");
        return "男宝名字:叶嘉弘，女宝名字:叶锦钰";
    }
}
