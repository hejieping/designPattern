package com.learn.strategy;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class StrategyMain {
    public static void main(String[] args){
        Context context = new Context(new ConcretStrategyA());
        context.ContextAlgorithm();
        context = new Context(new ConcretStrategyB());
        context.ContextAlgorithm();
        context = new Context(new ConcretStrategyC());
        context.ContextAlgorithm();
    }
}
