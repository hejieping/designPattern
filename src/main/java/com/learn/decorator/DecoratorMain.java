package com.learn.decorator;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class DecoratorMain {
    public static void main(String[] args){
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorB.Operation();
    }



}
