package com.eama.xxx.controller;

import com.eama.xxx.common.model.AjaxResult;
import com.eama.xxx.service.ISendMailService;
import com.eama.xxx.service.IUserService;
import lombok.val;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

/**
 * @author Xiexingxie
 * @date 2023/2/19 下午 11:13
 */

@RestController
@RequestMapping("sendemail/api-v1")
public class SendEmailController {
    
   
    private final IUserService iUserService;
    private final ISendMailService sendMailService;
    public SendEmailController(IUserService iUserService, ISendMailService sendMailService) {
        this.iUserService = iUserService;
        this.sendMailService = sendMailService;
    }

    @PutMapping("getuser_nameSendEmail")
    public AjaxResult getUserNameSendEmail(Integer userId){
        val user = iUserService.selUserById(userId);
        return AjaxResult.success("操作成功",user);
    }
    
    @RequestMapping("send")
    public void sendMail(){
        sendMailService.sendMail();
    }

    @RequestMapping("sendfile")
    public void sendfile() throws MessagingException {
        sendMailService.sendMailFile();
    }
}
