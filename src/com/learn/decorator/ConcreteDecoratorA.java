package com.learn.decorator;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;
    @Override
    public void Operation() {
        super.Operation();
        addedState="new state";
        System.out.println("具体操作对象A");
    }
}
class ConcreteDecoratorB extends Decorator {
    @Override
    public void Operation() {
        super.Operation();
        AddedBehavior();
        System.out.println("具体操作对象B");
    }
    private void AddedBehavior(){

    }
}
