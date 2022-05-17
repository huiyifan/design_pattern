package com.yf.adapter.clazz;

public class FlyTest {

    public static void main(String[] agrs){
        IFly iBird = new BirdAdapter();
        iBird.fly();

        IFly iAirPlane = new AirPlaneAdapter();
        iAirPlane.fly();
    }

}
