package com.learn.state;

/**
 * Created by jieping.hjp on 2017/7/9.
 */
public class StateMain {
    public static void main(String[] args){
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
    }


}
