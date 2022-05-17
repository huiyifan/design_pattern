package com.yf.singleInstance;

// 懒汉式+同步锁
public class Single2 implements IPrint{

   private Single2(){}

   private static Single2 mInstance;

   public static synchronized Single2 getInstance(){
       if (mInstance == null) {
           mInstance = new Single2();
       }
       return mInstance;
   }

   @Override
   public void print(String des) {
      System.out.println(" Single2: " + getInstance().hashCode());
   }

}
