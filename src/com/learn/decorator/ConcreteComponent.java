package com.learn.decorator;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class ConcreteComponent implements Component{
    @Override
    public void Operation() {
        System.out.println("具体操作对象");
    }
}
