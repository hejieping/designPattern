package com.learn.factory;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class FactoryMain {
    public static void main(String[] args){
        Factory factory = new ConcreteFactoryA();
        Parent parent = factory.createObject();
        parent.operation();
    }
}
