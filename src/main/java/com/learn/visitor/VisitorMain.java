package com.learn.visitor;

/**
 * Created by jieping.hjp on 2017/7/13.
 */
public class VisitorMain {
    public static void main(String[] args){
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());

        objectStructure.accept(new ConcreteVisitorA());
        objectStructure.accept(new ConcreteVisitorB());
    }
}
