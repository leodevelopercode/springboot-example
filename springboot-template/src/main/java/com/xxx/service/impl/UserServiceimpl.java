package com.xxx.service.impl;

import com.xxx.mapper.UserMapper;
import com.xxx.module.entities.User;
import com.xxx.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Xiexingxie
 * @date 2023/2/27 下午 01:09
 */

@Service
public class UserServiceimpl implements IUserService {
    
    private final UserMapper userMapper;

    public UserServiceimpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> selListUser() {
        List<User> collect = userMapper.selListUser().stream()
                .filter(user -> user.getUser_id() <= 1)
                .collect(Collectors.toList());
        return collect;
    }
}
