package com.learn.factory;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class ConcreteFactoryA implements Factory{
    @Override
    public Parent createObject() {
        return new SonA();
    }
}
