package com.learn.subscribe;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class ConcreteObserver implements Observer{
    private String name;
    private String observerState;
    private ConcreteSubject subject;
    public ConcreteObserver(ConcreteSubject subject,String name){
        this.name = name;
        this.subject = subject;
    }
    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者"+name+"的状态："+observerState);
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
