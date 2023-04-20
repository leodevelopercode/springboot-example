package com.eama.xxx.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Xiexingxie
 * @date 2023/2/19 下午 11:08
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendEmailToUser {
    
    private String name;
    private String email;
    
}
