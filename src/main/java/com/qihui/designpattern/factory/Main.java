package com.qihui.designpattern.factory;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class Main {
    public static void main(String[] args) {
        Car byd = DefaultCarFactory.createCar("byd");

        GeelyCarFactory geelyCarFactory = new GeelyCarFactory();
        Car geely = geelyCarFactory.creteCar();

        byd.run();
        geely.run();
    }
}
