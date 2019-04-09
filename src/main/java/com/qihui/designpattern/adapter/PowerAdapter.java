package com.qihui.designpattern.adapter;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class PowerAdapter implements JP110VInterface {
    private CN220VInteface cn220VInteface;

    //对象方式构造
    public PowerAdapter(CN220VInteface cn220VInteface) {
        this.cn220VInteface = cn220VInteface;
    }

    @Override
    public void connect() {
        cn220VInteface.connect();
    }
}
