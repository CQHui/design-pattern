package com.qihui.designpattern.template;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class Main {
    public static void main(String[] args) {
        PayOrderTemplate aliPayOrder = new AliPayOrder();
        aliPayOrder.process();

        //
        PayOrderTemplate payOrder = () -> System.out.println("自定义支付");
        payOrder.process();
    }
}
