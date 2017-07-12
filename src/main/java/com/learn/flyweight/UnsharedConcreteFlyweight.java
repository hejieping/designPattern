package com.learn.flyweight;

/**
 * Created by jieping.hjp on 2017/7/12.
 */
public class UnsharedConcreteFlyweight implements Flyweight{
    @Override
    public void opearation(int extrinsistate) {
        System.out.println("unsharedConcreteFlyweight "+extrinsistate);
    }
}
