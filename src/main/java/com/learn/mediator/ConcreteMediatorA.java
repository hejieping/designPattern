package com.learn.mediator;

/**
 * Created by jieping.hjp on 2017/7/12.
 */
public class ConcreteMediatorA implements Mediator {
    private ConcreteColleagueA concreteColleagueA;
    private ConcreteColleagueB concreteColleagueB;

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague == concreteColleagueA){
            concreteColleagueB.notify(message);
        }
        else
        {
            concreteColleagueA.notify(message);
        }
    }
}
