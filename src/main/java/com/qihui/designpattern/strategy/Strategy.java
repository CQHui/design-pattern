package com.qihui.designpattern.strategy;

/**
 * @author chenqihui
 * @date 2019/4/10
 */
public abstract class Strategy {
    abstract void algorithmInterface();
}

class StrategyA extends Strategy {
    @Override
    void algorithmInterface() {
        System.out.println("算法A");
    }

}

class StrategyB extends Strategy {

    @Override
    void algorithmInterface() {
        System.out.println("算法B");
    }

}

class StrategyC extends Strategy {

    @Override
    void algorithmInterface() {
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