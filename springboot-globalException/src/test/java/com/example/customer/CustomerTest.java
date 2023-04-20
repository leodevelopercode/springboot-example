package com.example.customer;

import org.junit.Test;

/**
 * @author Xiexingxie
 * @date 2023/3/12 下午 05:42
 */


public class CustomerTest {

    @Test
    public void hashCodeTest() {
        String str = "18170690681";
        int hashCode = str.hashCode();
        int encryption = 20230312;
        int i = hashCode ^ encryption;
        if (i <= 0){
            
        }
        System.out.println(i);
    }
    
}
