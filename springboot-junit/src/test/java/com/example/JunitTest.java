package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author Xiexingxie
 * @date 2023/4/3 下午 10:15
 */


public class JunitTest {

    Calculator calculator = new Calculator();
    
    @Test
    public void count() {
        
        int numberOne = 10;
        int numberTwo = 10;
        int add = calculator.add(numberOne, numberTwo);
        /**
         * assertThat: 将方法返回的结果与预期值进行对比，相同测试通过，反之
         * actual: 预期值
         * isEqualTo: 方法结果值
         */
        assertThat(20).isEqualTo(add);


    }
    
    class Calculator{
        int add(int a, int b){
            return a + b;
        }

    }
}
