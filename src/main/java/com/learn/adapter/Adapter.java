package com.learn.adapter;

/**
 * Created by jieping.hjp on 2017/7/9.
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
