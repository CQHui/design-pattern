package com.qihui.designpattern.adapter;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class CN220VIntefaceImpl implements CN220VInteface {
    @Override
    public void connect() {
        System.out.println("中国220v电压工作中");
    }
}
