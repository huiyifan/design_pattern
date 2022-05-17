package com.yf.chain;

public class ConcreteHandler2 extends Handler{

    @Override
    public void handleMsg(String req) {
        if(ConcreteHandler2.class.getSimpleName().equals(req)){
           System.out.println("具体处理者2负责处理该请求!");
        }else if(getNext() != null){
            getNext().handleMsg(req);
        }else{
            System.out.println("请求无人处理流失了!");
        }
    }

}
