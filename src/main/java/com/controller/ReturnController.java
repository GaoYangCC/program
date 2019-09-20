package com.controller;

import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.service.UserService;

import javax.annotation.Resource;

@Controller
public class ReturnController {

    @Resource
    UserService us;
    @RequestMapping("/Blog")
    public String index()  {
        System.out.println("wq213123123");
        User user = us.Login("屈林");
        System.out.println(user.getAge());
        return "index";
    }
}