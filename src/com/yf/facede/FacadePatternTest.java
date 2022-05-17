package com.yf.facede;

public class FacadePatternTest {

    public static void main(String[] args){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRect();
        shapeMaker.drawCircle();
    }

}
