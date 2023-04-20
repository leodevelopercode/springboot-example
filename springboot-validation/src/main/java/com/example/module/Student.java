package com.example.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Xiexingxie
 * @date 2023/3/27 下午 07:36
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private int sid;
    @NotBlank(message = "姓名不能为空！")
    private String sname;

    
    private int sage;
    
    private int ssex;
    
    private String saccount;
    
    private String spassword;
    
    private int gid;

}
