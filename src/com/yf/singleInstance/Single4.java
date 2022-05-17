package com.yf.singleInstance;

// 双重效验锁 DCL
public class Single4 implements IPrint{

    private Single4(){}

    private volatile static Single4 mInstance;

    public static Single4 getInstance(){
        if (mInstance == null) {
            synchronized (Single4.class){
                if(mInstance == null){
                   mInstance = new Single4();
                }
            }
        }
        return mInstance;
    }

    @Override
    public void print(String des) {
        System.out.println(" Single4: " + getInstance().hashCode());
    }

}
