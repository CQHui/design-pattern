package com.qihui.designpattern.decorator;

/**
 * Created by Elliott Chen on 2023/4/20 18:06
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is a circle");
    }
}
