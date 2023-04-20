package com.example.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Xiexingxie
 * @date 2023/3/30 下午 10:33
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class People {

    @Id
    @Column(
            name = "userId"
    )
    private Integer userId;
    @Column(
            name = "userName"
    )
    private String userName;
    private String password;
    private String name;
    @Column(
            name = "departmentId"
    )
    private Integer departmentId;
    private String position;
    private String email;
    private String phone;
    @Column(
            name = "isAdmin"
    )
    private String isAdmin;

}
