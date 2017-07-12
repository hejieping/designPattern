package com.learn.mediator;

/**
 * Created by jieping.hjp on 2017/7/12.
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }
    public void send(String message){
        mediator.send(message,this);
    }
    public void notify(String message){
        System.out.println("colleagueB get "+message);
    }

}
