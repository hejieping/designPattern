package com.learn.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> items = new ArrayList<>();
    public int count(){
        return items.size();
    }
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    public Object get(int index){
        return items.get(index);
    }
    public void insert(int index,Object Objects){
        items.add(index, Objects);
    }

}
