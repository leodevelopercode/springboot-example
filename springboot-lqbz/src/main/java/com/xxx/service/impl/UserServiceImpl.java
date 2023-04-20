package com.xxx.service.impl;


import com.xxx.mapper.UserMapper;
import com.xxx.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author Xiexingxie
 * @date 2023/2/21 下午 09:37
 */


@Service
public class UserServiceImpl implements IUserService {
    
    
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int countUser() {

        int count = userMapper.countUser();

        return count;
    }
}
