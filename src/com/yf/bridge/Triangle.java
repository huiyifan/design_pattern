package com.yf.bridge;


public class Triangle implements IShape{

    @Override
    public String des(IColor color) {
        return color.value()+"三角";
    }
}
