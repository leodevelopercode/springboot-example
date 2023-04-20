package com.xxx.controller;

import com.xxx.model.User;
import com.xxx.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xiexingxie
 * @date 2023/3/5 下午 02:05
 */
@RestController
public class UserController {
    
    private final UserService userService;
    
    public UserController(UserService service) {
        this.userService = service;
    }
    
    @GetMapping("findUserByusername")
    public User gerCount(String username){
        return null; 
    }
    
}
