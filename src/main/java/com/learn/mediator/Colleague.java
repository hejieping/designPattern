package com.learn.mediator;

/**
 * Created by jieping.hjp on 2017/7/12.
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
