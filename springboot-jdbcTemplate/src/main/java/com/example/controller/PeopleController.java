package com.example.controller;

import com.example.model.entity.People;
import com.example.repository.PeopleRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author Xiexingxie
 * @date 2023/3/12 下午 10:26
 */

@RestController
@RequestMapping("people/api-v1")
public class PeopleController {
    
    private final PeopleRepository peopleRepository;

    public PeopleController(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }
    
    @RequestMapping("")
    public  List<People> selpeople(){
        List<People> maps = peopleRepository.selPeopleById();
        return maps;
    }
    
}
