package com.yf.singleInstance;

// 饿汉式
public class Single3 implements IPrint{

   private Single3(){}

   public static Single3 mInstance = new Single3();

   public static Single3 getInstance(){
       return mInstance;
   }

   @Override
   public void print(String des) {
      System.out.println(" Single3: " + getInstance().hashCode());
   }

}
