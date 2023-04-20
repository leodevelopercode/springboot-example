package com.xxx.module.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName(value = "people")
public class PeopleInfo {
    
    @TableId(value = "userId",type = IdType.AUTO)
    private Integer user_id;
    @TableField("userName")
    private String user_name;            
    private String name;
    @TableField("departmentId")
    private Integer department_id;
    private String position;
    private String email;
    private String phone;
    @TableField("isAdmin")
    private char is_admin;
    
}
