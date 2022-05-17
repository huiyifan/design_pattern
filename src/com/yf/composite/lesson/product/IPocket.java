package com.yf.composite.lesson.product;

import com.yf.composite.lesson.color.IColor;

public interface IPocket {
    void color(IColor color);
    void count(int count);
    void unit(String unit);
    void operate();
}
