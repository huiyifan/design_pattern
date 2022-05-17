package com.yf.chain;

public class ConcreteHandlerTest {

    public static void main(String[] args){
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        handler1.handleMsg(ConcreteHandlerTest.class.getSimpleName());
    }

}
