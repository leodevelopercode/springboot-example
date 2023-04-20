package com.xxx.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;



public enum InfoEnum {

    OK("0", "正常"), DISABLE("1", "停用"), DELETED("2", "删除");

    private final String code;
    private final String info;

    InfoEnum(String code, String info)
    {
        this.code = code;
        this.info = info;
    }

    public String getCode()
    {
        return code;
    }

    public String getInfo()
    {
        return info;
    }
    
}
