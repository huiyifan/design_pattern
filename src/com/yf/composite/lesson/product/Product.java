package com.yf.composite.lesson.product;

import com.yf.composite.lesson.color.IColor;

// 普通商品
public class Product implements IProduct {

    private String mName;
    private IColor mColor;
    private double mPrice;
    private int mCount;
    private String mUnit;

    public Product(String name){
        this.mName = name;
    }

    @Override
    public void color(IColor color) {
        this.mColor = color;
    }

    @Override
    public void price(double price) {
        mPrice = price;
    }

    @Override
    public void count(int count) {
        mCount = count;
    }

    @Override
    public void unit(String unit) {
        mUnit = unit;
    }

    @Override
    public void operate() {
        System.out.println(mCount+mUnit+mName+"(单价 " + mPrice + "元)");
    }
}
