package com.yf.chain.log;

public class DebugLogger extends AbsLogger{

    public DebugLogger(){
        this.level = AbsLogger.DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println(DebugLogger.class.getSimpleName()+": " + message);
    }

}
