package com.qihui.designpattern.Facade;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class AliSmsServiceImpl implements AliSmsService {
    @Override
    public void sendSms() {
        System.out.println("发送阿里信息");
    }
}
