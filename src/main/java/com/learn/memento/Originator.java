package com.learn.memento;

/**
 * Created by jieping.hjp on 2017/7/9.
 */
public class Originator {
    private  String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public Memento createMemento(){
        return new Memento(state);
    }
    public void setMemento(Memento memento){
        state = memento.getState();
    }
    public void show(){
        System.out.println(state);
    }

}
