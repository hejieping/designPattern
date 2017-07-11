package com.learn.composite;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public abstract class Component {
    protected  String name;
    public Component(String name){
        this.name = name;
    }
    public abstract void remove(Component c);
    public abstract void add(Component c);
    public abstract void display(int depth);
}
