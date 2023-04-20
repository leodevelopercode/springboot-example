package com.xxx.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

/**
 * @author Xiexingxie
 * @date 2023/4/13 上午 10:01
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String user_name;
    private String name;
    private String position;
    private String is_admin;


}
