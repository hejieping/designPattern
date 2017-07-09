package com.learn.simpleFactory;

/**
 * Created by jieping.hjp on 2017/7/7.
 *
 */
public class OperationFactory {
    public static  Operation createOperate(String operate)
    {
        Operation operation = null;
        switch (operate)
        {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:;
        }
        return operation;
    }
}