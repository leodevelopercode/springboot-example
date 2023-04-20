package com.xxx.service.impl;

import com.xxx.service.IDepartmentService;
import com.xxx.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

/**
 * @author Xiexingxie
 * @date 2023/2/21 下午 09:36
 */

@Service
public class DepartServiceImpl implements IDepartmentService {
    
    private final DepartmentMapper departmentMapper;

    public DepartServiceImpl(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    @Override
    public int countDepartment() {

        int count = departmentMapper.countDepartment();

        return count;
    }
}
