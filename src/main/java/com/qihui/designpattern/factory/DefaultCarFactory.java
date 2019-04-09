package com.qihui.designpattern.factory;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class DefaultCarFactory {
    /**
     *  简单工厂模式
     *  单一工厂模式，职责过多，扩展性不高
     */
    public static Car createCar(String name) {
        switch (name) {
            case "geely":
                return new Geely();
            case "byd":
                return new Byd();
            default:
                return null;
        }
    }
}
