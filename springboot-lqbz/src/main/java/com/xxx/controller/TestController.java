package com.xxx.controller;

import com.xxx.entities.CountToUserAndDepartment;
import com.xxx.entities.PeopleInfo;
import com.xxx.service.ICountToUserAndDepartmentService;
import com.xxx.service.PeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @author Xiexingxie
 * @date 2023/2/26 下午 09:48
 */


@RestController
@RequestMapping("test/api-v1")
public class TestController {
    
    private final ICountToUserAndDepartmentService countToUserAndDepartmentService;
    private final PeopleService peopleService;
    public TestController(ICountToUserAndDepartmentService countToUserAndDepartmentService, PeopleService peopleService) {
        this.countToUserAndDepartmentService = countToUserAndDepartmentService;
        this.peopleService = peopleService;
    }

    @GetMapping("getCountMsg")
    public CountToUserAndDepartment getCountMsg(){
        CountToUserAndDepartment countToUserAndDepartment = countToUserAndDepartmentService.countTwo();
        return countToUserAndDepartment;
    }

    @RequestMapping("people")
    public List<PeopleInfo> people() throws IOException {
        List<PeopleInfo> people1 = peopleService.getPeople();
        return people1;
    }

}
