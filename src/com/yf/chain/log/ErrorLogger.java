package com.yf.chain.log;

public class ErrorLogger extends AbsLogger{

    public ErrorLogger(){
        this.level = AbsLogger.ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println(ErrorLogger.class.getSimpleName()+": " + message);
    }

}
