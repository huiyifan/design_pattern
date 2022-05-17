package com.yf.decorator.len;

public class FilletChineseHamburger extends MutiChineseHamburger{

    public FilletChineseHamburger(ChineseHamburger chineseHamburger) {
        super(chineseHamburger);
    }

    @Override
    public void description() {
       System.out.println("夹馍+里脊 总价: " + cost());
    }

    @Override
    public double cost() {
        return super.cost()+3;
    }
}
