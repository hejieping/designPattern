package com.learn.bridge;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class ConcreteImplementorA implements Implementor{

    @Override
    public void operation() {
        System.out.print("concreteImplementor A");
    }
}
