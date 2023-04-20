package com.example.service.impl;

import com.example.service.MessageService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Xiexingxie
 * @date 2023/3/12 下午 08:28
 */

@Service
public class MessageServiceRabbitmqDirectImpl implements MessageService {
    
    private final AmqpTemplate amqpTemplate;

    public MessageServiceRabbitmqDirectImpl(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    /**
     * s:指定交换机
     * s1:key名称
     * 消息内容
     * @param id
     */
    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已纳入处理队列(rabbitmq direct),id" + id);
        amqpTemplate.convertAndSend("directExchange","direct",id);
    }

    @Override
    public String doMessage() {
        System.out.println("已经完成消息发送业务");
        return null;
    }
}
