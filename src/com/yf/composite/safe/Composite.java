package com.yf.composite.safe;

import java.util.ArrayList;
import java.util.List;

class Composite implements Component, IArray{

    private String name;
    private List<Component> components = new ArrayList<>();

    public Composite(String name){
        this.name = name;
    }

    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void remove(Component c) {
        components.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return components.get(i);
    }

    @Override
    public void operation() {
        if (components != null) {
            for (Component component : components) {
                component.operation();
            }
        }
    }
}
