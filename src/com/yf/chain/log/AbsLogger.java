package com.yf.chain.log;

public abstract class AbsLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    int level;

    private AbsLogger nextLogger;

    public void setNextLogger(AbsLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level == level){
           write(message);
        }
        else if(nextLogger != null){
           nextLogger.logMessage(level, message);
        }else{
            System.out.println("日志无法打印: " + message);
        }
    }

    protected abstract void write(String message);
}
