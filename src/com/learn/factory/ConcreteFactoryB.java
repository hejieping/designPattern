package com.learn.factory;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class ConcreteFactoryB implements Factory{

    @Override
    public Parent createObject() {
        return new SonB();
    }
}
