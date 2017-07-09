package com.learn.decorator;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class Decorator implements  Component{
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if(component!=null){
            component.Operation();
        }

    }

}
