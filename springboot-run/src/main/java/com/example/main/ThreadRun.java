package com.example.main;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Xiexingxie
 * @date 2023/3/16 下午 12:46
 */

@Component
public class ThreadRun {
    
    public static void threadRun(){
        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);
        service.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                int a = 20;
                for (int i = 0; i <= a ; i++) {
                    System.out.println(i);
                }
            }
        },3000,1000, TimeUnit.MILLISECONDS);
        return;
    }
    
}
