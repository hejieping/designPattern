package com.learn.state;

/**
 * Created by jieping.hjp on 2017/7/9.
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
