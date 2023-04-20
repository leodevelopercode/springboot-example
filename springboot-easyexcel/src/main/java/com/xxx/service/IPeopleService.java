package com.xxx.service;

import com.xxx.module.entities.PeopleInfo;
import com.xxx.module.vo.PeopleExcel;

import java.util.List;

public interface IPeopleService {

    List<PeopleInfo> selPeople();

    List<PeopleInfo>  selAllPeople();
    
    List<PeopleExcel> selExcelData();

    Integer countPeople();
    
    void exportPeople();
    
}
