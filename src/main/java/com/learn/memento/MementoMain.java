package com.learn.memento;

/**
 * Created by jieping.hjp on 2017/7/9.
 */
public class MementoMain {
    public static void main(String[] args){
        Originator originator = new Originator();
        originator.setState("on");
        originator.show();

        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.createMemento());

        originator.setState("off");
        originator.show();

        originator.setMemento(careTaker.getMemento());
        originator.show();
    }
}
