package com.learn.bridge;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
    public abstract void operation();
}
