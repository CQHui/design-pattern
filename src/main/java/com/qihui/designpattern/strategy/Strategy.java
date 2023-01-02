package com.qihui.designpattern.strategy;

/**
 * @author chenqihui
 * @date 2019/4/10
 */
public interface Strategy {
    void algorithmInterface();
}

class StrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法A");
    }

}

class StrategyB implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("算法B");
    }

}

class StrategyC implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("算法C");
    }

}
// 使用上下文维护算法策略

class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void algorithmInterface() {
        strategy.algorithmInterface();
    }

}