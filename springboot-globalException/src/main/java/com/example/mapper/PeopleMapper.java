package com.example.mapper;

import com.example.model.entity.People;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface PeopleMapper
{
    
    List<People> selpeopleAll(Integer userid);
    
}
