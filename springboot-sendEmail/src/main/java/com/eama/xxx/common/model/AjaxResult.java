package com.eama.xxx.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Xiexingxie
 * @date 2023/2/19 下午 11:17
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AjaxResult {

    private static final long serialVersionUID = 1L;

    private long code;
    private String message;
    private Object obj;

    /***
     * 成功返回结果
     * @param message
     * @return
     */
    public static AjaxResult success(String message){
        return new AjaxResult(200,message,null);
    }

    /**
     * 成功返回结果
     * @param message
     * @param obj
     * @return
     */
    public static AjaxResult success(String message,Object obj){
        return new AjaxResult(200,message,obj);
    }

    /**
     * 失败返回结果
     * @param message
     * @return
     */
    public static AjaxResult error(String message){
        return new AjaxResult(500,message,null);
    }

    /**
     * 失败返回结果
     * @param message
     * @param obj
     * @return
     */
    public static AjaxResult error(String message,Object obj){
        return new AjaxResult(500,message,obj);
    }
    
    
}
