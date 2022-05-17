package com.yf.singleInstance;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args){

//        ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 8, 1L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        for(int i = 0; i < 5; i++){
//            executor.execute(new Runnable() {
//                @Override
//                public void run() {
//                    testSingle6();
//                }
//            });

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    testSingle1();
                }
            });
            thread.setName("Thead: " + i);
            thread.run();
        }


    }

    private static void testSingle1(){
        Single1.getInstance().print(null);
    }

    private static void testSingle2(){
        Single2.getInstance().print(null);
    }

    private static void testSingle3(){
        Single3.getInstance().print(null);
    }

    private static void testSingle4(){
        Single4.getInstance().print(null);
    }

    private static void testSingle5(){
        Single5.getInstance().print(null);
    }

    private static void testSingle6(){
        Single6.Instance.print(null);
    }

}
