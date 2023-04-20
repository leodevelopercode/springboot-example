package com.xxx.module.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.*;

import java.io.Serializable;

/**
 * @author Xiexingxie
 * @date 2023/2/28 下午 03:27
 */


@Getter
@Setter
@EqualsAndHashCode
public class PeopleExcel implements Serializable {

    
    @TableField("userName")
    @ExcelProperty("名称")
    private String user_name;
    @ExcelProperty("姓名")
    private String name;
    @ExcelProperty("部门ID")
    @TableField("departmentId")
    private Integer department_id;
    @ExcelProperty("职位")
    
    private String position;
    @ExcelProperty("邮箱")
    private String email;
    @ExcelProperty("电话")
    private String phone;
    @ExcelProperty("是否管理员")
    @TableField("isAdmin")
    private char is_admin;
    
}
