package com.learn.iterator;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public interface Iterator {
    Object first();
    Object next();
    boolean isDone();
    Object currentItem();
}
