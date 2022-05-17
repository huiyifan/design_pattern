package com.yf.composite.transparent;

interface Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int i);
    void operation();
}
