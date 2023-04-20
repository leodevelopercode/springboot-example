package com.example.controller;

import com.example.module.ResultInfo;
import com.example.module.Student;
import com.example.module.vo.Customers;
import com.example.service.CustomersService;
import com.example.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Xiexingxie
 * @date 2023/3/27 下午 05:10
 */

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomersController {
    
    private final CustomersService customersService;
    private final StudentService studentService;
    
    
    /**
     * 查询c_id不低于10001的信息，并使用Stream流处理并且返回结果
     * api:http://localhost:8080/customer
     * @return
     */
    @GetMapping("")
    public ResultInfo customersList(){
        List<Customers> customers = customersService.selCustomers();
        return ResultInfo.ok(customers); 
    }

    /**
     * api: http://localhost:8080/customer
     * @param customers
     * @return
     */
    @PostMapping("")
    public ResultInfo inster(@RequestBody Customers customers){
        customersService.insterCustomers(customers);
        return ResultInfo.ok();
    }

    /**
     * api: http://localhost:8080/customer/savestu
     * @param student
     * @return
     */
    @PostMapping("savestu")
    public ResultInfo insterStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return ResultInfo.ok();
    }
    
}
