package com.qihui.designpattern.responsibility;

/**
 * Created by Elliott Chen on 2023/5/5 10:27
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Standard Console::Logger: " + msg);
    }
}
