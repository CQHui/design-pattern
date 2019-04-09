package com.qihui.designpattern.template;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class WechatPayOrder extends PayOrderTemplate {
    @Override
    protected void pay() {
        System.out.println("微信支付");
    }
}
