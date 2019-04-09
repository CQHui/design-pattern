package com.qihui.designpattern.adapter;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class JP110VIntefaceImpl implements JP110VInterface {
    @Override
    public void connect() {
        System.out.println("日本110v电压工作中");
    }
}
