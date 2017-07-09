package com.learn.proxy;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
