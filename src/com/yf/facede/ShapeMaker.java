package com.yf.facede;

public class ShapeMaker {
    private IShape mRectangle;
    private IShape mCircle;
    private IShape mSquare;

    public ShapeMaker(){
        mRectangle = new Rectangle();
        mCircle = new Circle();
        mSquare = new Square();
    }

    public void drawRect(){
        mRectangle.draw();
    }

    public void drawCircle(){
        mCircle.draw();
    }

    public void drawSquare(){
        mSquare.draw();
    }
}
