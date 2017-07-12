package com.learn.flyweight;

import java.util.Hashtable;

/**
 * Created by jieping.hjp on 2017/7/12.
 */
public class FlywieghtFactory {
    private Hashtable<String,Flyweight> flyweights = new Hashtable();
    public FlywieghtFactory(){
        flyweights.put("X",new ConcreteFlyweight());
        flyweights.put("Y",new ConcreteFlyweight());
        flyweights.put("Z",new ConcreteFlyweight());
    }
    public Flyweight getFlyweight(String key){
        return flyweights.get(key);
    }
}
