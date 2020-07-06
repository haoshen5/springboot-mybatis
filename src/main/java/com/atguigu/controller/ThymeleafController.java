package com.atguigu.controller;

import com.atguigu.domain.User;
import com.mysql.cj.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class ThymeleafController {

    @RequestMapping("/demo")
    public String demo(Model model, HttpSession session){
        model.addAttribute("hello","hello,thymeleaf!!!");

        //集合数据
        List<User> users = new ArrayList<User>();
        users.add(new User("张三","123","张三"));
        users.add(new User("李四","123","李四"));
        users.add(new User("王五","123","王五"));
        model.addAttribute("users",users);

        //Map定义
        Map<String,Object> dataMap = new HashMap<String,Object>();
        dataMap.put("No","123");
        dataMap.put("address","深圳");
        model.addAttribute("dataMap",dataMap);

        //存储一个数组
        String[] names = {"张三","李四","王五"};
        model.addAttribute("names",names);

        //日期
        model.addAttribute("now",new Date());

        session.setAttribute("uname","guanyu");

        //if条件
        model.addAttribute("age",22);

        return "demo";  //视图解析 ThymeleafViewResolver
    }

}
