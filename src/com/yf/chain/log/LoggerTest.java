package com.yf.chain.log;

public class LoggerTest {

    public static void main(String[] args){
        AbsLogger errorLogger = new ErrorLogger();
        AbsLogger debugLogger = new DebugLogger();
        AbsLogger infoLogger = new InfoLogger();

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

//        infoLogger.setNextLogger(debugLogger);
//        debugLogger.setNextLogger(errorLogger);
//        infoLogger.setNextLogger(infoLogger);

        errorLogger.logMessage(AbsLogger.ERROR, "error Message");
        errorLogger.logMessage(AbsLogger.DEBUG, "debug Message");
        errorLogger.logMessage(AbsLogger.INFO, "info Message");
    }

}
