package com.example.controller;

import com.example.model.entity.People;
import com.example.service.IPeopleService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Xiexingxie
 * @date 2023/3/11 下午 09:30
 */

@RestController
@RequestMapping("api-v1/global")
public class GlobalExceptionController {
    
    private final IPeopleService peopleService;

    public GlobalExceptionController(IPeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @RequestMapping("getexception")
    public Object global(){
        return 10/0;
    }

    @RequestMapping("peopleallinfo/{userid}")
    public List<People> getPeopleAllinfo(@PathVariable Integer userid){
        return peopleService.selpeopleAll(userid);
    }
    
}
