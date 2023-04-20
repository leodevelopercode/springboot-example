package com.xxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.xxx.mapper")
@ComponentScan(basePackages = {"com"})
public class SpringbootLqbzApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLqbzApplication.class, args);
    }

}
