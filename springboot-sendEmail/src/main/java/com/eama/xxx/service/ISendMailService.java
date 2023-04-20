package com.eama.xxx.service;

import javax.mail.MessagingException;

public interface ISendMailService {
    
    void sendMail();
    
    void sendMailFile() throws MessagingException;
    
}
