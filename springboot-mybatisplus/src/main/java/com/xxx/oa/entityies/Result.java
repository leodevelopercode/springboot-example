package com.xxx.oa.entityies;

/**
 * @author Xiexingxie
 * @date 2023/2/27 上午 09:54
 */


public class Result<T> {

    private int code;
    private String msg;
    private T data;

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
