package com.learn.visitor;

/**
 * Created by jieping.hjp on 2017/7/13.
 */
public interface Element {
    void accept(Visitor visitor);

}
