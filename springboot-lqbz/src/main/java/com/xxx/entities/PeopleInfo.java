package com.xxx.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Xiexingxie
 * @date 2023/2/28 下午 03:14
 */


@AllArgsConstructor
@Data
@NoArgsConstructor
public class PeopleInfo {
    
    private Integer user_id;
    private String user_name;            
    private String name;
    private Integer department_id;
    private String position;
    private String email;
    private String phone;
    private char is_admin;
    
}
