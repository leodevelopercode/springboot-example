package com.xxx.oa.entityies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Xiexingxie
 * @date 2023/2/21 下午 09:34
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    
    private int department_id;
    private String name;
    private String description;
    private int parent_id;
    
}
