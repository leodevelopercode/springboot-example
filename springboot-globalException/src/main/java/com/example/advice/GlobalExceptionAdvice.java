package com.example.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Xiexingxie
 * @date 2023/3/11 下午 09:13
 */


@ControllerAdvice
public class GlobalExceptionAdvice{

    private final static Logger log = LoggerFactory.getLogger(GlobalExceptionAdvice.class);
    
    /**
     * @ResponseBody:本次处理返回信息基于RestFul风格完成的
     * @ExceptionHandler:可以捕获的异常类型
     * message:获取异常信息
     * status:获取异常状态码
     * exception:获取异常名
     * path:获取异常路径
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object exceptionHandler(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("message",e.getMessage());
        map.put("status", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        map.put("exception",e.getClass().getName());
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        map.put("path",request.getRequestURL());
        return map;
    }
    
}