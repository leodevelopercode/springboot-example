package com.xxx.oa.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.oa.entityies.User;

import java.util.List;

/**
 * @author Xiexingxie
 * @date 2023/2/27 上午 08:42
 */


public interface IUserService extends IService<User> {

    List<User> selUserList();
    
    
}
