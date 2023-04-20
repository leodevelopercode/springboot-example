package com.eama.xxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.eama.xxx.mapper")
public class SendEmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(SendEmailApplication.class, args);
    }

}
