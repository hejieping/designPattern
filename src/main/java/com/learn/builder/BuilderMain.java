package com.learn.builder;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class BuilderMain {
    public static void main(String[] args){
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.construct(b1);
        Product p1 = b1.getResult();

        director.construct(b2);
        Product p2 = b2.getResult();

        p1.show();
        p2.show();
    }
}
