package com.yf.bridge;

public class Rectangle implements IShape{
    @Override
    public String des(IColor color) {
        return color.value()+ "矩形";
    }
}
