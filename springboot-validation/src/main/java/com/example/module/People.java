package com.example.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author Xiexingxie
 * @date 2023/3/30 下午 10:33
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    
    @NotBlank(message = "UserName Not Null!")
    private Integer userId;
    private String userName;
    private String password;
    private String name;
    private Integer departmentId;
    private String position;
    private String email;
    private String phone;
    private String isAdmin;
    
}
