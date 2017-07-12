package com.learn.singleton;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){}
    public Singleton getInstance(){
        return instance;
    }

}
