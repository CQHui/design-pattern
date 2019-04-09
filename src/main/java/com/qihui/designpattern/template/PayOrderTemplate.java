package com.qihui.designpattern.template;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public abstract class PayOrderTemplate {

    protected  void buyProduct() {
        System.out.println("购买商品");
    }

    protected void address() {
        System.out.println("填写地址");
    }

    protected void order() {
        System.out.println("下单");
    }

    protected abstract void pay();

    protected void deliver() {
        System.out.println("发货");
    }

    public void process() {
        buyProduct();
        address();
        order();
        pay();
        deliver();
    }
}
