package com.example.controller;

import com.example.module.vo.PeopleVo;
import com.example.service.PeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Xiexingxie
 * @date 2023/4/13 下午 06:47
 */


@RestController
@RequestMapping("people/api/v1")
public class PeopleController {
    
    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }
    
    @GetMapping
    public List<PeopleVo> getPeopleRepository(){
        return peopleService.getPeopleRepository();
    }
    
}
