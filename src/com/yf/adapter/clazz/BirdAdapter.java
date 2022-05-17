package com.yf.adapter.clazz;

public class BirdAdapter extends Bird implements IFly{

    @Override
    public void fly() {
        wingFly();
    }
}
