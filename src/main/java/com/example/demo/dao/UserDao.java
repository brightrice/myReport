package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.User;

@Mapper
public interface UserDao {  
    public User selectUserById(Integer userId);  
  
}  