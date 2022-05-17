package com.yf.flyweight;

public class FlyweightPatternTest {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String []args){
        for(int i = 0; i < 20; i++){
            Circle circle = ShapeFactory.getCircle(randomColor());
            circle.setX(randomX());
            circle.setY(randomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String randomColor() {
        return colors[(int)(Math.random()* colors.length)];
    }

    private static int randomX(){
        return (int)(Math.random()*100);
    }

    private static int randomY(){
        return (int)(Math.random()*100);
    }
}
