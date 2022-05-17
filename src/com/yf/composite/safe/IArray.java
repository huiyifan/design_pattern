package com.yf.composite.safe;

interface IArray {

    void add(Component c);
    void remove(Component c);
    Component getChild(int i);

}
