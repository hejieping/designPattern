package com.learn.prototype;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class ConcretePrototype1 implements Prototype{
    @Override
    public Prototype Clone() {
            return new ConcretePrototype1();

    }
}
