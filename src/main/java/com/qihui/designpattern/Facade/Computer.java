package com.qihui.designpattern.Facade;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class Computer {
    AliSmsService aliSmsService;
    EmailSmsService emailSmsService;
    WechatSmsService wechatSmsService;

    public Computer() {
        aliSmsService = new AliSmsServiceImpl();
        emailSmsService = new EmailSmsServiceImpl();
        wechatSmsService = new WechatSmsServiceImpl();
    }

    public void sendMsg() {
        aliSmsService.sendSms();
        emailSmsService.sendSms();
        wechatSmsService.sendSms();
    }
}
