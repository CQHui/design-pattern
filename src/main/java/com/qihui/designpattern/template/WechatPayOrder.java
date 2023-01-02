package com.qihui.designpattern.template;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class WechatPayOrder implements PayOrderTemplate {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
