package com.learn.simpleFactory;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class OperationDiv extends Operation  {
    @Override
    public  Double getResult() {
        if(getNumberB()==0){
            System.out.println("除数benign为零");
        }
        return getNumberA()/getNumberB();
    }
}
