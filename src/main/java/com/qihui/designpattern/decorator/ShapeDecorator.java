package com.qihui.designpattern.decorator;

/**
 * Created by Elliott Chen on 2023/4/20 18:07
 */
public class ShapeDecorator implements Shape {

    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
