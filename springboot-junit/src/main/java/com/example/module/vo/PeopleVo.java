package com.example.module.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

/**
 * @author Xiexingxie
 * @date 2023/4/13 下午 06:43
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PeopleVo {

    private String userName;
    private String name;
    private Integer departmentId;
    private String position;
    private String email;
    private String phone;
    private String isAdmin;


}
