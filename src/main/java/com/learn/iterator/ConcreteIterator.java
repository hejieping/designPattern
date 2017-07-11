package com.learn.iterator;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate concreteAggregate;
    private int current = 0;
    public ConcreteIterator(ConcreteAggregate concreteAggregate){
        this.concreteAggregate = concreteAggregate;
    }
    @Override
    public Object first() {
        return concreteAggregate.get(0);
    }

    @Override
    public Object next() {
        current++;
        return current<concreteAggregate.count()?concreteAggregate.get(current):null;
    }

    @Override
    public boolean isDone() {
        return current>=concreteAggregate.count();
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.get(current);
    }
}
