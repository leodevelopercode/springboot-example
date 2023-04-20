package com.example.service.impl;

import com.example.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author Xiexingxie
 * @date 2023/3/12 下午 09:00
 */


@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public void order(String id) {
        System.out.println("订单开始处理");
        System.out.println("订单处理结束");
        System.out.println("订单开始处理");
    }
}
