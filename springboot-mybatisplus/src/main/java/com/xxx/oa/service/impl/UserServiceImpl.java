package com.xxx.oa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.oa.dao.UserDao;
import com.xxx.oa.entityies.User;
import com.xxx.oa.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Xiexingxie
 * @date 2023/2/27 上午 08:42
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> selUserList() {
        List<User> userList = userDao.selUserList();
        long count = userList.stream()
                .count();
        log.info("selUserList查询到的总数为：{}", count);
        List<User> collect = userList.stream()
                .filter(user -> user.getUser_id() < 20)
                .collect(Collectors.toList());
        return collect;
    }
}
