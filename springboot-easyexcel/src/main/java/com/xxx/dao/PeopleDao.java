package com.xxx.dao;

import com.xxx.module.entities.PeopleInfo;
import com.xxx.module.vo.PeopleExcel;

import java.util.List;

public interface PeopleDao {

    List<PeopleInfo>  selPeople();
    List<PeopleInfo>  selAllPeople();
    List<PeopleExcel> selExcelData();
    Integer countPeople();
    
}
