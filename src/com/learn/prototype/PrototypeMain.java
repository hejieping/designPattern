package com.learn.prototype;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class PrototypeMain {
    public static void main(String[] args){
        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1();
        ConcretePrototype1 concretePrototype2 = (ConcretePrototype1) concretePrototype1.Clone();

    }
}
