package com.learn.simpleFactory;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class simpleFactoryMain {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperate("+");
        operation.setNumberA(1D);
        operation.setNumberB(2D);
        System.out.println(operation.getResult());
    }
}
