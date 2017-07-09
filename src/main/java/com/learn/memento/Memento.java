package com.learn.memento;

/**
 * Created by jieping.hjp on 2017/7/9.
 */
public class Memento {
    private String state;
    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
