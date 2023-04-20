package com.example.repository;


import com.example.model.entity.People;

import java.util.List;
import java.util.Map;

/**
 * @author Xiexingxie
 * @date 2023/3/12 下午 10:01
 */


public interface PeopleRepository {

    List<People> selPeopleById();
    
}
