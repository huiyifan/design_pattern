package com.yf.chain.log;

public class InfoLogger extends AbsLogger{

    public InfoLogger(){
        this.level = AbsLogger.INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println(InfoLogger.class.getSimpleName()+": " + message);
    }

}
