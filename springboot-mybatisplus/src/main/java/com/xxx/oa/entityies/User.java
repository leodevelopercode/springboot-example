package com.xxx.oa.entityies;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("oa_user")
public class User implements Serializable {
    
    @TableId
    @TableField(value = "userId")
    private Integer user_id;
    @TableField(value = "userName")
    private String user_name;
    private String name;
    @TableField(value = "departmentId")
    private int department_id;
    private String position;
    private String email;
    private String phone;
    @TableField(value = "isAdmin")
    private String is_admin;
}
