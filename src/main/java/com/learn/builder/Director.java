package com.learn.builder;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class Director {
    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
