package com.learn.templateMethod;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class ConcreteClassB extends AbstractClass{

    @Override
    public void primitiveOperation1() {
        System.out.println("classB primitiveOperation1");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("classB primitiveOperation2");
    }
}
