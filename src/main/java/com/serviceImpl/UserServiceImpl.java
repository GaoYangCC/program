package com.serviceImpl;

import com.dao.UserDao;
import com.model.User;
import org.springframework.stereotype.Component;
import com.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    @Override
    public User Login(String username) {
       User user=userDao.selectUserByName(username);
        return user;
    }
}
