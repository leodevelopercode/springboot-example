package com.xxx.oa.entityies;

import com.xxx.oa.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserTest {
    
    @Autowired
    private IUserService userService;
    
    @Test
    public void selectList() {
        userService.query();
    }

}