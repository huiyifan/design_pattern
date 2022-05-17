package com.yf.singleInstance;

// 懒汉式
public class Single1 implements IPrint{

   private Single1(){}

   private static Single1 mInstance;

   public static Single1 getInstance(){
       if (mInstance == null) {
           mInstance = new Single1();
       }
       return mInstance;
   }

   @Override
   public void print(String des) {
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println(" Single1: " + getInstance().hashCode());
   }
}
