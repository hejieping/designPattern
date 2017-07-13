package com.learn.visitor;

/**
 * Created by jieping.hjp on 2017/7/13.
 */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
