package com.learn.simpleFactory;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class OperationSub extends Operation {
    @Override
    public Double getResult(){
        return getNumberA()-getNumberB();
    }

}
