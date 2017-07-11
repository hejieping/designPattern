package com.learn.iterator;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class IteratorMain {
    public static void main(String[] args){
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        for(int i = 0; i < 5;i++){
            concreteAggregate.insert(i,"员工"+i);
        }
        Iterator iterator = concreteAggregate.createIterator();
        while (!iterator.isDone()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }

    }
}
