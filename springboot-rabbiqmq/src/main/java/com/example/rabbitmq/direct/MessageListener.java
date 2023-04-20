package com.example.rabbitmq.direct;

/**
 * @author Xiexingxie
 * @date 2023/3/12 下午 08:48
 */


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息监听
 */
@Component
public class MessageListener 
{

    /**
     * @RabbitListener：绑定消息队列的名称
     * @param id
     */
    @RabbitListener(queues = "direct_queue")
    public void receive(String id){
        System.out.println("已经完成消息的发送(rabbitMqDirect):" + id);
    }
    
}
