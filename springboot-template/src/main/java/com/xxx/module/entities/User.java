package com.xxx.module.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Xiexingxie
 * @date 2023/2/14 下午 11:16
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    
    private Integer user_id;
    private String user_name;
    private String name;
    private int department_id;
    private String position;
    private String email;
    private String phone;
    private String is_admin;
}
