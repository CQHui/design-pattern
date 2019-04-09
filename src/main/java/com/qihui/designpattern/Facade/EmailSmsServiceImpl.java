package com.qihui.designpattern.Facade;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class EmailSmsServiceImpl implements EmailSmsService{
    @Override
    public void sendSms() {
        System.out.println("发送email");
    }
}
