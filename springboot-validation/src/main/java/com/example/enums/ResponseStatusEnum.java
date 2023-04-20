package com.example.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseStatusEnum {
    
    SUCCESS(200L,"成功！"), FAIL(500L,"失败！");
    
    private final Long code;
    private final String msg;
    
    
    
}
