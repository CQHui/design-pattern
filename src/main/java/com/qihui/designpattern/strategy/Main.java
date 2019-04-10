package com.qihui.designpattern.strategy;

/**
 * @author chenqihui
 * @date 2019/4/10
 */
public class Main {
    public static void main(String[] args) {
        Context context;
        context = new Context(new StrategyA());
        context.algorithmInterface();
        context = new Context(new StrategyB());
        context.algorithmInterface();
        context = new Context(new StrategyC());
        context.algorithmInterface();
    }
}
