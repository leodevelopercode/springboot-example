package com.eama.xxx.config;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @author Xiexingxie
 * @date 2023/2/20 上午 12:24
 */


public class SendEmailConfig {

    // 指定发送邮箱的主机为Localhost
    private static final String LOCALHOST = "localhost";

    // 设置发送人的邮箱
    private static final String TO = "2892849211@qq.com";

    
    public void sendEmail(String to, String form) {

        // 获取系统属性
        Properties properties = new Properties();
        // 设置邮箱服务器
        properties.setProperty("mail.smtp.host", LOCALHOST);
        // 获取默认session对象
        Session session = Session.getDefaultInstance(properties);
        // 创建默认的MimeSession对象
        MimeMessage mimeMessage = new MimeMessage(session);
        try {
            // Set Form 头部头字段
            mimeMessage.setFrom(new InternetAddress(form));
            // Set To: 头部头字段
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            // Set Subject: 头部头字段
            mimeMessage.setSubject("This is the Subject Line!");
            // 设置消息体
            mimeMessage.setText("This is actual message");
            Transport.send(mimeMessage);
            System.out.println("发送成功");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }
}
