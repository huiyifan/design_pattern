package com.yf.singleInstance;

// 枚举单例
public enum Single6 implements IPrint{

    Instance;

    @Override
    public void print(String des) {
        System.out.println(" Single6: " + Instance.hashCode());
    }

}
