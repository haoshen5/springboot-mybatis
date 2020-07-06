package com.atguigu.controller;


import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController   //组合  @Controller 和 @ResponseBody
public class UserController {

    @Autowired
    UserService userService; // JDK动态代理

    //@RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @GetMapping("/findAll")
    public List<User> findAll(){

        // com.sun.proxy.$Proxy72  数字是任意的
        System.out.println("userService.getClass() = " + userService.getClass());

        return userService.findAll();
    }

}
