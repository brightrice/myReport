package com.example.demo.serviceTest;

import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.baseTest.SpringTestCase;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;


public class UserServiceTest extends SpringTestCase{
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired    
    private UserService userService; 
    @Test 
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(10);  
        logger.info("查找结果" + user);  
    }  

}
