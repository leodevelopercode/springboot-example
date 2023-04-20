package com.xxx.oa.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxx.oa.entityies.User;

import java.util.List;

/**
 * @author Xiexingxie
 * @date 2023/2/27 上午 08:41
 */


public interface UserDao extends BaseMapper<User> {
    
    List<User> selUserList();
    
}
