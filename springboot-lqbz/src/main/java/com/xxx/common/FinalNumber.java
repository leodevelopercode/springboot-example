package com.xxx.common;

import java.util.Random;

/**
 * @author Xiexingxie
 * @date 2023/3/13 下午 03:02
 */


public class FinalNumber {
    
    private final static Object FINALNUMBER = new Random(1);

    public static void main(String[] args) {
        Random random = new Random();
        long l = random.nextInt(999999);
        if (l <= 0){
            return;
        }
        System.out.println(l);
    }
    
}
