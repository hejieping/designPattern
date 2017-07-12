package com.learn.bridge;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class BridgeMain {
    public static void main(String[] args){
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new concreteImplementorB());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();
    }
}
