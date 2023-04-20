package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


/**
 * @author Xiexingxie
 * @date 2023/3/12 下午 09:53
 */



public class JdbcTemplateConfig {
    
    
    @Bean
    public JdbcTemplate dataSource(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
    
}
