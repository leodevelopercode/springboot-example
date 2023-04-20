package com.eama.xxx.service.impl;

import com.eama.xxx.service.ISendMailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author Xiexingxie
 * @date 2023/3/12 下午 06:19
 */

@Service
public class SendMailServiceImpl implements ISendMailService {
    
    private static final String FORM = "nixgnixeix@163.com";
    private static final String TO = "2892849211@qq.com";
    private static final String SUBJECT = "本邮件仅为springboot-sendEmail工程测试使用!";
    private static final String CONTEXT = "<a href='http://www.baidu.com'>数据中心环境异常!!!</a>";
    
    private final JavaMailSender javaMailSender;

    public SendMailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(FORM);
        message.setTo(TO);
        message.setSubject(SUBJECT);
        message.setText(CONTEXT);
//        message.setSentDate();
        javaMailSender.send(message);
    }

    /**
     * MimeMessageHelper:MimeMessage mimeMessage, boolean multipart
     * 创建邮件消息，是否支持邮件发送文件
     * String text, boolean html
     * setFrom:邮件标题、是否开启html特效
     * setTo:收件人
     * setSubject:邮件主题
     * setText:邮件内容文本
     * mimeMessageHelper.addAttachment 创建文件名时，如是图片需加入文件后缀，否则图片不显示
     *
     * @throws MessagingException
     */
    @Override
    public void sendMailFile() throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message,true);
        mimeMessageHelper.setFrom(FORM + "(数据中心)");
        mimeMessageHelper.setTo(TO);
        mimeMessageHelper.setSubject(SUBJECT);
        mimeMessageHelper.setText(CONTEXT,true);
        File file = new File("G:\\resourceCode\\springboot\\springboot-sendEmail\\src\\main\\resources\\img\\huh.jpg");
        mimeMessageHelper.addAttachment(file.getName() + ".jpg",file);
        javaMailSender.send(message);
    }
}
