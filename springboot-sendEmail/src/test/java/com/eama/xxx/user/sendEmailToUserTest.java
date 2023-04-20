package com.eama.xxx.user;

import com.eama.xxx.service.ISendMailService;
import com.eama.xxx.service.IUserService;
import com.eama.xxx.service.impl.SendMailServiceImpl;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Xiexingxie
 * @date 2023/2/19 下午 11:39
 */


public class sendEmailToUserTest {
    
    @Test
    public void sendMail() {
    }

    @Test
    public void now() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
    
    
    
}
