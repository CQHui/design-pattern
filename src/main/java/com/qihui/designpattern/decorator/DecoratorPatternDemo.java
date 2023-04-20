package com.qihui.designpattern.decorator;

/**
 * Created by Elliott Chen on 2023/4/20 18:11
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle of red border");
        redCircle.draw();

        System.out.println("Rectangle of red border");
        redRectangle.draw();
    }
}
