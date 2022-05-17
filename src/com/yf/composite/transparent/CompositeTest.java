package com.yf.composite.transparent;

public class CompositeTest {

    public static void main(String[] args){
        Component root = new Composite("root");
        Component c1 = new Composite("c1");
        Component c2 = new Composite("c2");

        Component l1 = new Leaf("l1");
        Component l2 = new Leaf("l2");
        Component l3 = new Leaf("l3");

        c2.add(l2);
        c2.add(l3);

        c1.add(c2);

        root.add(c1);
        root.add(l1);
        root.operation();
    }

}
