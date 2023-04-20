package com.xxx.service;

import com.xxx.service.impl.PeopleServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

class IPeopleServiceTest {
    
    @Autowired
    private IPeopleService iPeopleService;
    
    @Test
    public void selPeopleTest() {
        iPeopleService.selPeople()
                .forEach(x -> System.out.println(x));
    }

}