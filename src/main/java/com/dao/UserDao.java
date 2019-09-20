package com.dao;

import com.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
    public interface UserDao {
        User selectUserByName(String name);
    }
