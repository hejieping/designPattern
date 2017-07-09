package com.learn.adapter;

/**
 * Created by jieping.hjp on 2017/7/9.
 */
public class AdapterMain {
    public static void main(String[] args){
        Target target = new Adapter();
        target.request();
    }
}
