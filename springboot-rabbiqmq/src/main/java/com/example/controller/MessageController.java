package com.example.controller;

import com.example.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xiexingxie
 * @date 2023/3/12 下午 08:55
 */

@RestController
@RequestMapping("messgae/apiv1")
public class MessageController {
    
    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }
    
    @RequestMapping
    public String doMessage(){
        String id = messageService.doMessage();
        return id;
    }
    
}
