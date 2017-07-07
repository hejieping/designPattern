package com.learn.templateMethod;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class templateMain {
    public static void main(String[] args){
        AbstractClass abstractClass;

        abstractClass = new ConcreteClassA();
        abstractClass.templateMethod();

        abstractClass = new ConcreteClassB();
        abstractClass.templateMethod();
    }
}
