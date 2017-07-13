package com.learn.interpreter;

;

/**
 * Created by jieping.hjp on 2017/7/12.
 */
public class TerminalExpression implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("terminal interpret");
    }
}
