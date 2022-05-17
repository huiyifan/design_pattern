package com.yf.decorator.len;

public class SimpleChineseHamburger implements ChineseHamburger{

    @Override
    public void description() {
        System.out.println("普通夹馍 总价: " + cost());
    }

    @Override
    public double cost() {
        return 3;
    }
}
