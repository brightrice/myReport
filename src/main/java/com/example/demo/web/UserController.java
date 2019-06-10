package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired 
    private UserService userService;  
    
    //@ResponseBody
    @RequestMapping("/t1")
    public String getIndex(Model model){      
        User user = userService.selectUserById(1);  
        model.addAttribute("user", user); 
        return "index";    
    } 
}