package com.xxx.api.controller;

import com.xxx.module.entities.PeopleInfo;
import com.xxx.service.IPeopleService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Xiexingxie
 * @date 2023/2/28 下午 04:01
 */

@RestController
@RequestMapping("people/api-v1")
@RequiredArgsConstructor
public class PeopleController {
    
    private static final Logger log = LoggerFactory.getLogger(PeopleController.class);
    private final IPeopleService peopleService;
    
    
    @GetMapping("selpeople")
    public List<PeopleInfo> selPeople(){
        long startTime = System.currentTimeMillis();
        val peopleInfos = peopleService.selPeople();
        long endTime = System.currentTimeMillis();
        log.info("controller:selPeopleStream运行的时长为:{}",endTime-startTime+"ms");
        return peopleInfos;
    }

    @GetMapping("")
    public List<PeopleInfo> selAllpeople(){
        long startTime = System.currentTimeMillis();
        val allPeopleInfos = peopleService.selAllPeople();
        long endTime = System.currentTimeMillis();
        log.info("controller:selPeopleStream运行的时长为:{}",endTime-startTime+"ms");
        return allPeopleInfos;
    }
    
}
