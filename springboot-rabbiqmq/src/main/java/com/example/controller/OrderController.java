package com.example.controller;

import com.example.service.OrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xiexingxie
 * @date 2023/3/12 下午 08:58
 */

@RestController
@RequestMapping("order/apiv1")
public class OrderController {
    
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping("{id}")
    public void order(@PathVariable String id){
        orderService.order(id);
    }
    
}
