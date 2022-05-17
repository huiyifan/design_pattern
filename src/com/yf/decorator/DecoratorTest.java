package com.yf.decorator;

public class DecoratorTest {

    public static void main(String[] args){

        Shape circle = new Circle();
        ShapeDecorator redCirCle = new RedShapeDecorator(new Circle());
        ShapeDecorator rectRect = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle with red border");
        redCirCle.draw();

        System.out.println("Rectangle with red border");
        rectRect.draw();
    }


}
