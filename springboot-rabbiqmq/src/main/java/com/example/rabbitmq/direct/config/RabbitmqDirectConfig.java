package com.example.rabbitmq.direct.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置RabbbitMq消息队列
 * @author Xiexingxie
 * @date 2023/3/12 下午 08:35
 */

@Configuration
public class RabbitmqDirectConfig
{

    /**
     * 创建消息队列:direct_quque
     * durable:是否开启持久化操作
     * exclusive:当前的消息是否是当前连接的专用,连接一关消息自动删除
     * autoDelete:生产者跟消费者都不用则删除
     * @return
     */
    @Bean
    public Queue directQueue(){
        return new Queue("direct_queue");
    }

    @Bean
    public Queue directQueueTwo(){
        return new Queue("direct_queue_two");
    }

    /**
     * 一个交换机可以绑定多个消息
     * 创建名为directExchange的交换机
     * @return
     */
    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("directExchange");
    }

    /**
     * 将消息跟交换机绑定
     * @return
     */
    @Bean
    public Binding bindingDirect(){
        return BindingBuilder.bind(directQueue()).to(directExchange()).with("direct");
    }

    /**
     * 将消息跟交换机绑定
     * @return
     */
    @Bean
    public Binding bindingDirectTwo(){
        return BindingBuilder.bind(directQueueTwo()).to(directExchange()).with("directTwo");
    }
    
    
    
}
