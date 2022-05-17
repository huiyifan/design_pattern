package com.yf.composite.lesson.product;

import com.yf.composite.lesson.color.IColor;

import java.util.ArrayList;
import java.util.List;

// 可以装商品和包的包，大包，小包
public class Pocket implements IPocket, IOperator {

    private PocketEnum pocketEnum;
    private IColor mColor;
    private double mPrice;
    private int mCount;
    private String mUnit;

    private List<IPocket> mPockets = new ArrayList<>();

    public Pocket(PocketEnum pocketEnum){
        this.pocketEnum = pocketEnum;
    }

    @Override
    public void color(IColor color) {
        mColor = color;
    }

    @Override
    public void count(int count) {
        mCount = count;
    }

    @Override
    public void unit(String unit) {
        mUnit = unit;
        if (mUnit == null) {
            mUnit = "个";
        }
    }

    @Override
    public void add(IPocket product) {
        mPockets.add(product);
    }

    @Override
    public void remove(IPocket product) {
        mPockets.remove(product);
    }

    @Override
    public IPocket getChild(int i) {
        return mPockets.get(i);
    }

    @Override
    public void operate() {
        System.out.println(mCount+mUnit+ (mColor != null ? mColor.color() : "")+(pocketEnum != null ? pocketEnum.name(pocketEnum.type) :""));

        if (mPockets != null && mPockets.size() > 0) {
            for (IPocket pocket : mPockets) {
                if (pocket != null) {
                    pocket.operate();
                }
            }
        }
    }
}
