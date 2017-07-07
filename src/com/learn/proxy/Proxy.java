package com.learn.proxy;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class Proxy implements Subject {
    RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        if(realSubject==null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
