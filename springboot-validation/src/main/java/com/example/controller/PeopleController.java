package com.example.controller;

import com.example.module.People;
import com.example.service.PeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Xiexingxie
 * @date 2023/3/30 下午 10:59
 */

@RestController
@RequestMapping("people")
public class PeopleController {

    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping("")
    public List<People> selAllPeopleLimit() {
        return peopleService.selAllPeopleLimit();
    }

    /**
     * api: http://localhost:8080/people/selpeoplelimit
     *
     * @return
     */
    @GetMapping("selpeoplelimit")
    public List<People> selpeoplelimit() {
        return peopleService.selpeoplelimit();
    }

    /**
     * api: http://localhost:8080/people/countpeople
     *
     * @return
     */
    @GetMapping("countpeople")
    public Integer countpeople() {
        Integer count = peopleService.countPeople();
        return count;
    }

}
