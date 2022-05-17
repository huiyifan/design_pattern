package com.yf.bridge;

public class BridgeTest {

    public static void main(String[] args){
        IColor red = new RedColor();
        IColor green = new GreenColor();

        IShape rectangle = new Rectangle();
        rectangle.des(red);
        rectangle.des(green);

        IShape triangle = new Triangle();
        triangle.des(red);
        triangle.des(green);

    }


}
