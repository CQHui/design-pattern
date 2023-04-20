package com.qihui.designpattern.decorator;

/**
 * Created by Elliott Chen on 2023/4/20 18:09
 */
public class RedShapeDecorator extends ShapeDecorator{

    void setRedBoard() {
        System.out.println("Border Color: Red");
    }

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        setRedBoard();
        super.draw();
    }
}
