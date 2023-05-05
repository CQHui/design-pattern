package com.qihui.designpattern.responsibility;

/**
 * Created by Elliott Chen on 2023/5/5 10:47
 */
public class WarnLogger extends AbstractLogger {

    public WarnLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Warn::Logger: " + msg);

    }
}
