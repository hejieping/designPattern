package com.learn.strategy;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class Context {
    private  Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void ContextAlgorithm() {
        strategy.Algorithm();
    }
}
