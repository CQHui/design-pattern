package com.qihui.designpattern.decorator;

/**
 * Created by Elliott Chen on 2023/4/20 18:06
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("this is rectangle");
    }
}
