package com.qihui.designpattern.responsibility;

/**
 * Created by Elliott Chen on 2023/5/5 10:29
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Error::Logger: " + msg);

    }
}
