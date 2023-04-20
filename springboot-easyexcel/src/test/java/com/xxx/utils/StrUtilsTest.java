package com.xxx.utils;

import com.baomidou.mybatisplus.extension.api.R;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * @author Xiexingxie
 * @date 2023/3/3 下午 01:30
 */

class StrUtilsTest {

    /**
     * 字符串截取
     */
    
    
    @Test
    public void testStr() { 
        String str = "nixgnixeix@163.com";
        int i = str.indexOf('@');
        // 从下标0开始截取到i的下标
        String substring = str.substring(0,i);
        System.out.println("substring = " + substring);
    }

    /**
     * 代码运行时间计算
     */
    @Test
    public void testData() {
        long startTime = new Date().getTime();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
        long entTime = new Date().getTime();
        System.out.println((entTime - startTime) / 1000.0  + "s");
    }

    /**
     * 时间转换
     * 以及当月的第一天以及最后一天
     */
    @Test
    public void SimpleDataFormat() {
        Date date = new Date();
        System.out.println("date = " + date);
        String format = new SimpleDateFormat().format(date);
        System.out.println("format = " + format);// 输出format = 23-3-3 下午7:28
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format1 = simpleDateFormat.format(date);// 输出format1 = 2023-03-03
        System.out.println("format1 = " + format1);
        
        LocalDate today = LocalDate.now();
        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);
        LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayOfMonth);

    }

    /**
     * 手机号脱敏操作
     * 对手机号中间四位数进行加密
     */
    @Test
    public void strHide() {
        String str = "18170690681";
        String s = str.replaceAll("(\\w{3})\\w*(\\w{4})", "$1****$2");
        System.out.println(s);
    }

    /**
     * 泛型
     */
    @Test
    public void fanxing() {
        FX<String> rfx = new FX<>();
        rfx.add("asfa");
        FX<Integer> rfx1 = new FX<>();
        rfx1.add(121);
    
    }
    class FX<R>{
        
        public void add(R r){
            System.out.println("r = " + r);
        }
        
    }
    
    
}
