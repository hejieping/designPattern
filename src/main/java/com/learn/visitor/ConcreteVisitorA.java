package com.learn.visitor;

/**
 * Created by jieping.hjp on 2017/7/13.
 */
public class ConcreteVisitorA implements Visitor{

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getName()+" "+this.getClass().getName());
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getName()+" "+this.getClass().getName());
    }
}
