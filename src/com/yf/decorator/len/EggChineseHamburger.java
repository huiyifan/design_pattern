package com.yf.decorator.len;

public class EggChineseHamburger extends MutiChineseHamburger{

    public EggChineseHamburger(ChineseHamburger chineseHamburger) {
        super(chineseHamburger);
    }

    @Override
    public void description() {
        System.out.println("夹馍+鸡蛋 总价: " + cost());
    }

    @Override
    public double cost() {
        return super.cost()+2;
    }
}
