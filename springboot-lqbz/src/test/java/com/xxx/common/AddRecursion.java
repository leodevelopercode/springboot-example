package com.xxx.common;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

/**
 * @author Xiexingxie
 * @date 2023/3/4 下午 01:50
 */


class AddRecursion {

    private TestTemplate restTemolate = null;
    
    @Test
    public void recursion() {
        System.out.println(sum(100));
    }

    @Test
    public void testRestTemplate() {

        
        
    }
        
    
    
    /**
     * 递归
     * 
     * **/
    int sum(int n){
        if (n == 1){ // 判断是否是终结点
            return  1;
        } else {
            System.out.println("n = " + n);
            return n + sum(n -1);
        }
    }
    
}
