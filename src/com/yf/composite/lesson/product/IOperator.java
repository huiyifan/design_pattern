package com.yf.composite.lesson.product;

public interface IOperator {

    void add(IPocket product);
    void remove(IPocket product);
    IPocket getChild(int i);

}
