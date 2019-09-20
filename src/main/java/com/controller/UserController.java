package com.controller;

import com.dao.UserDao;
import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    UserDao userDao;

    @RequestMapping("cs")
    public String cs() {

        User user = userDao.selectUserByName("");
        if(user!=null){
            return "1";
        }else{
            return "0";
        }

    }
}