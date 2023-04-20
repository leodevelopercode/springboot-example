package com.xxx.common;

import org.junit.jupiter.api.Test;

/**
 * @author Xiexingxie
 * @date 2023/3/4 下午 02:28
 */


public class RecursionMain {

    
    
    
    public static void main(String[] args) {

        int x = 100;
        int y;
        for (int i = 0; i <= x; i++) {
            y = i + x;
            System.out.println("y = " + y);
        }
        
//        System.out.println(recursion(100));
    }
    
     static int recursion (int x){
        if (x == 1){
            return  1;
        } else {
            return x + recursion(x - 1);
        }
    }

    @Test
    public void weiyi() {
        int i  = 1;
        int x = 10;
        System.out.println(x >> 1);
    }
    
}
