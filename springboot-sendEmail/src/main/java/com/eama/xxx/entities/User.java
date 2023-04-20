package com.eama.xxx.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Xiexingxie
 * @date 2023/2/19 下午 10:20
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
