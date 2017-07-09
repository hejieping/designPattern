package com.learn.subscribe;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class SubscribeMain {
    public static void main(String[] args){
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(new ConcreteObserver(concreteSubject,"X"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject,"Y"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject,"Z"));
        concreteSubject.setSubjectState("ABC");
        concreteSubject.notification();
    }
}
