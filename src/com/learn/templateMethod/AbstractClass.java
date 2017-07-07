package com.learn.templateMethod;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public abstract class AbstractClass {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();

    }
}
