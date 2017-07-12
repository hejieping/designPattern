package com.learn.bridge;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
