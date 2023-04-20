package com.xxx.list.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Xiexingxie
 * @date 2023/3/4 下午 08:30
 */


@AllArgsConstructor
@Data
@NoArgsConstructor
public class People {
    
    private String name;
    private String gender;
    private int age;
    
}
