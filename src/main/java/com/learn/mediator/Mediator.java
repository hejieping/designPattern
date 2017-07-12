package com.learn.mediator;

/**
 * Created by jieping.hjp on 2017/7/12.
 */
public interface Mediator {
    void send(String message,Colleague colleague);
}
