package com.xxx.oa.controller;

import com.xxx.oa.dao.UserDao;
import com.xxx.oa.entityies.User;
import com.xxx.oa.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Xiexingxie
 * @date 2023/2/27 上午 08:50
 */

@RestController
@RequestMapping("user/api-v1")
public class UserController {
    
    private final IUserService userService;
    private final UserDao userDao;

    public UserController(IUserService userService
                        , UserDao userDao) {
        this.userService = userService;
        this.userDao = userDao;
    }
    
    @GetMapping("selUser")
    public List<User> selUser(){
        return userService.selUserList();
    }

    @GetMapping("selUserById")
    public List<User> selUserById(){
        return userService.selUserList();
    }
    


}
