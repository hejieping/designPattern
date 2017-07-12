package com.learn.mediator;

/**
 * Created by jieping.hjp on 2017/7/12.
 */
public class MediatorMain {
    public static void main(String[] args){
        ConcreteMediatorA concreteMediatorA = new ConcreteMediatorA();
        ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA(concreteMediatorA);
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB(concreteMediatorA);
        concreteMediatorA.setConcreteColleagueA(concreteColleagueA);
        concreteMediatorA.setConcreteColleagueB(concreteColleagueB);

        concreteColleagueA.send("how are you");
        concreteColleagueB.send("I'm fine, thank you");

    }
}
