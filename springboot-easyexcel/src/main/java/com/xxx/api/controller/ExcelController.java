package com.xxx.api.controller;

import com.xxx.service.IPeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xiexingxie
 * @date 2023/3/1 下午 07:37
 */

@RestController
@RequestMapping("excel/api-v1")
public class ExcelController {
    
    private final IPeopleService peopleService;

    public ExcelController(IPeopleService peopleService) {
        this.peopleService = peopleService;
    }
    
    @GetMapping("getExceldata")
    public String writeExcel(){
        peopleService.selExcelData();
        return "SUCCESS";
    }
    
    
}
