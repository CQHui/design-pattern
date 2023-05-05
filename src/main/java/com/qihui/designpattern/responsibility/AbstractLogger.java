package com.qihui.designpattern.responsibility;

/**
 * Created by Elliott Chen on 2023/5/5 10:08
 */
public abstract class AbstractLogger {
    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int WARN = 3;
    public static final int ERROR = 4;

    protected int level;

    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String msg) {
        if(this.level <= level){
            write(msg);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level, msg);
        }
    }

    abstract  protected void write(String msg);

}
