package com.xxx.controller;

import com.xxx.module.entities.User;
import com.xxx.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Xiexingxie
 * @date 2023/2/27 下午 01:20
 */


@Controller
@RequestMapping("user/api-v1")
public class UserController {
    
    private final IUserService userService;

    UserController(IUserService userService) {
        this.userService = userService;
    }


    @RequestMapping("/index")
    public String goindex(Model model){
        List<User> users = userService.selListUser();
        System.out.println(users);
        model.addAttribute("user",users);
        return "index";
    }
    
}
