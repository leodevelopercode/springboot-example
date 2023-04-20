package com.example.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Xiexingxie
 * @date 2023/3/11 下午 09:49
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class People 
{

    private Integer user_id;
    private String user_name;
    private String password;
    private String name;
    private Integer department_id;
    private String position;
    private String email;
    private String phone;
    private String is_admin;
    
}
