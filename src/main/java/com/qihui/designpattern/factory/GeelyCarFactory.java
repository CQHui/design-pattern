package com.qihui.designpattern.factory;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class GeelyCarFactory implements CarFactory {
    @Override
    public Car creteCar() {
        return new Geely();
    }
}
