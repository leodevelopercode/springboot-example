package com.xxx.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Xiexingxie
 * @date 2023/2/14 下午 11:16
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    private int user_id;
    private String user_name;
    private String name;
    private int department_id;
    private String position;
    private String email;
    private String phone;
    private String is_admin;
}
