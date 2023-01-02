package com.qihui.designpattern.strategy;

public class StrategyLambda {
    public static void main(String[] args) {
        //lambda实现抽象方法
        Context context = new Context(() -> System.out.println("lambda简化策略模式"));
        context.algorithmInterface();
    }
}
