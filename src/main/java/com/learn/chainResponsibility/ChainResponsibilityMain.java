package com.learn.chainResponsibility;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class ChainResponsibilityMain {
    public static void main(String[] args){
        Handle h1 = new ConcreteHandleA();
        Handle h2 = new ConcreteHandleB();
        h2.setSuccessor(h1);

        h2.HandleRequest(2);
        h2.HandleRequest(25);
    }
}
