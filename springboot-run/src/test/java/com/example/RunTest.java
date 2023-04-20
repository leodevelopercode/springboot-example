package com.example;

import org.junit.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Xiexingxie
 * @date 2023/3/16 下午 12:40
 */


public class RunTest {

    
    
    @Test
    public void run() {
        
        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);
        service.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("安徽的哈哈");
            }
        },3000,2000, TimeUnit.MILLISECONDS);
        return;
    }
    
}
