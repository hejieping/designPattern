package com.learn.state;

/**
 * Created by jieping.hjp on 2017/7/9.
 */
public class Context {
    private State state;
    public  Context(State state){
        this.state = state;
    }
    public void request(){
        state.handle(this);
        System.out.println(state.toString());
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
