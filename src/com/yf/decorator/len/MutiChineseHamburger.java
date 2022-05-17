package com.yf.decorator.len;

public abstract class MutiChineseHamburger implements ChineseHamburger{

    private ChineseHamburger mChineseHamburger;

    public MutiChineseHamburger(ChineseHamburger chineseHamburger){
        mChineseHamburger = chineseHamburger;
    }

    @Override
    public void description() {
        mChineseHamburger.description();
    }

    @Override
    public double cost() {
        return mChineseHamburger.cost();
    }
}
