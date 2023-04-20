package com.example.module.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Xiexingxie
 * @date 2023/3/27 下午 04:49
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customers {
    
    private Integer cId;
    private String cName;
    private String cAddress;
    private String cCtity;
    private String cZip;
    private String cContact;
    private String cEmail;
    
}
