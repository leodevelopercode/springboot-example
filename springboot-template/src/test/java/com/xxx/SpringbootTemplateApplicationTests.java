package com.xxx;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootTemplateApplicationTests {

    @Test
    void contextLoads() {
        
        String str = "mysql";
        byte[] bytes = str.getBytes();
        System.out.println("bytes = " + bytes.length);  

    }

    @Test
    public void testFor() {
        
//        for (int i = 0; i <)
    }

}
