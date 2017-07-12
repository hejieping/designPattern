package com.learn.chainResponsibility;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public abstract class Handle {
    protected Handle successor;

    public void setSuccessor(Handle successor) {
        this.successor = successor;
    }
    public abstract void HandleRequest(int request);
}
