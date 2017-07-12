package com.learn.flyweight;

/**
 * Created by jieping.hjp on 2017/7/12.
 */
public class FlyweightMain {
    public static void main(String[] args){
        int state = 22;
        FlywieghtFactory flywieghtFactory = new FlywieghtFactory();

        Flyweight fx = flywieghtFactory.getFlyweight("X");
        fx.opearation(state--);

        Flyweight fy = flywieghtFactory.getFlyweight("Y");
        fy.opearation(state--);

        Flyweight fz = flywieghtFactory.getFlyweight("Z");
        fz.opearation(state--);

        UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();
        unsharedConcreteFlyweight.opearation(state);

    }
}
