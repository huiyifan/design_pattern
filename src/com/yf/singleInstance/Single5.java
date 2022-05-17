package com.yf.singleInstance;

// 静态内部类
public class Single5 implements IPrint{

    private Single5(){}

    private static class Holder{
        private static Single5 mInstance = new Single5();
    }

    public static Single5 getInstance(){
        return Holder.mInstance;
    }

    @Override
    public void print(String des) {
        System.out.println(" Single5: " + getInstance().hashCode());
    }

}
