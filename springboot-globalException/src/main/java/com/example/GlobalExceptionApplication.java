package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @EnableCaching:本工程开启缓存技术
 */
@SpringBootApplication
@MapperScan("com.example.mapper")
@EnableCaching
public class GlobalExceptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalExceptionApplication.class, args);
    }

}
