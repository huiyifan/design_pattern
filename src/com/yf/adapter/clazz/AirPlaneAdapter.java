package com.yf.adapter.clazz;

public class AirPlaneAdapter extends AirPlane implements IFly{

    @Override
    public void fly() {
        engineFly();
    }
}
