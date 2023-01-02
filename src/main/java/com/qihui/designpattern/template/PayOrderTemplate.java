package com.qihui.designpattern.template;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public interface PayOrderTemplate {

    default void buyProduct() {
        System.out.println("购买商品");
    }

    default void address() {
        System.out.println("填写地址");
    }

    default void order() {
        System.out.println("下单");
    }

    void pay();

    default void deliver() {
        System.out.println("发货");
    }

    default void process() {
        buyProduct();
        address();
        order();
        pay();
        deliver();
    }
}
