package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.User;

public interface UserService {
    User selectUserById(Integer userId); 
}