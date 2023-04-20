package com.xxx.service.impl;

import com.xxx.mapper.DepartmentMapper;
import com.xxx.entities.CountToUserAndDepartment;
import com.xxx.mapper.UserMapper;
import com.xxx.service.ICountToUserAndDepartmentService;
import org.springframework.stereotype.Service;

/**
 * @author Xiexingxie
 * @date 2023/2/26 下午 10:30
 */
@Service
public class CountToUserAndDepartmentServiceImpl implements ICountToUserAndDepartmentService {
    
    private final UserMapper userMapper;
    private final DepartmentMapper departmentMapper;
    
    public CountToUserAndDepartmentServiceImpl(UserMapper userMapper, DepartmentMapper departmentMapper) {
        this.userMapper = userMapper;
        this.departmentMapper = departmentMapper;
    }
    
    @Override
    public CountToUserAndDepartment countTwo() {
        CountToUserAndDepartment countToUserAndDepartment = new CountToUserAndDepartment();
        int countUsers = userMapper.countUser();
        int countDepartment = departmentMapper.countDepartment();
        countToUserAndDepartment.setUserAcount(countUsers);
        countToUserAndDepartment.setDepartmentAcount(countDepartment);
        return countToUserAndDepartment;
    }
}
