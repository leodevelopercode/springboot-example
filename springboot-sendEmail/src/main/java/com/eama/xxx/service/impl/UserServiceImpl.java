package com.eama.xxx.service.impl;

import com.eama.xxx.entities.SendEmailToUser;
import com.eama.xxx.mapper.UserMapper;
import com.eama.xxx.service.IUserService;
import lombok.val;
import org.springframework.stereotype.Service;

/**
 * @author Xiexingxie
 * @date 2023/2/19 下午 10:25
 */


@Service
public class UserServiceImpl implements IUserService {
    // 指定发送邮箱的主机为Localhost
    private static final String LOCALHOST = "localhost";
    // 设置发送人的邮箱
    private static final String TO = "2892849211@qq.com";
    
    private final UserMapper userMapper;
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    
    
    @Override
    public SendEmailToUser selUserById(Integer userId) {
        // 查询用户的姓名以及邮箱
        val sendEmail = userMapper.selUserById(userId);
        return sendEmail;
    }
    
    
    
    
}
