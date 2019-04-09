package com.qihui.designpattern.adapter;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class Main {
    public static void main(String[] args) {
        CN220VInteface cn220VInteface = new CN220VIntefaceImpl();
        PowerAdapter powerAdapter = new PowerAdapter(cn220VInteface);
        ElectricCooker cooker = new ElectricCooker(powerAdapter);
        cooker.cook();
    }
}
