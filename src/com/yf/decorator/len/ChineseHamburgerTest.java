package com.yf.decorator.len;

public class ChineseHamburgerTest {

    public static void main(String[] args){
        ChineseHamburger chineseHamburger = new SimpleChineseHamburger();

        MutiChineseHamburger filletChineseHamburger = new FilletChineseHamburger(chineseHamburger);
        MutiChineseHamburger eggChineseHamburger = new EggChineseHamburger(chineseHamburger);

        chineseHamburger.description();
        filletChineseHamburger.description();
        eggChineseHamburger.description();
    }
}
