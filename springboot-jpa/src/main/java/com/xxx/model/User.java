package com.xxx.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SortNatural;

import javax.persistence.*;

/**
 * @author Xiexingxie
 * @date 2023/3/5 上午 10:49
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "t_user")
public class User {
    
    @Id
    @GeneratedValue
    private int user_id;
    @Column(
            name = "userName"
    )
    private String user_name;
    @Column(
            name = "password"
    )
    private String password;
    @Column(
            name = "name"
    )
    private String name;
    private int department_id;
    private String position;
    private String email;
    private String phone;
    private String is_admin;
    
}
