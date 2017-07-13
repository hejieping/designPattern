package com.learn.visitor;

/**
 * Created by jieping.hjp on 2017/7/13.
 */
public interface Visitor {
    void visitConcreteElementA(ConcreteElementA concreteElementA);
    void visitConcreteElementB(ConcreteElementB concreteElementB);
}
