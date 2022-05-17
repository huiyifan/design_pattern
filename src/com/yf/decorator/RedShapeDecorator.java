package com.yf.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decorator) {
        super(decorator);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decorator);
    }

    private void setRedBorder(Shape decorator){
        System.out.println("Border Color: Red");
    }

}
