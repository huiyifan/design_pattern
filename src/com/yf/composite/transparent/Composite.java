package com.yf.composite.transparent;

import java.util.ArrayList;
import java.util.List;

// 树枝构件
class Composite implements Component{

    private String name;
    private List<Component> children = new ArrayList<>();

    public Composite(String name){
        this.name = name;
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.remove(i);
    }

    @Override
    public void operation() {
        if (children != null) {
            for (Component child : children) {
                if (child != null) {
                    child.operation();
                }
            }
        }
    }
}
