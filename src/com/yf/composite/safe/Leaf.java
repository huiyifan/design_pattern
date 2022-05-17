package com.yf.composite.safe;

class Leaf implements Component{

    private String name;

    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("树枝:" + name + ":被访问");
    }
}
