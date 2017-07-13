package com.learn.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jieping.hjp on 2017/7/12.
 */
public class InterpreterMain {
    public static void main(String[] args){
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NoTerminalExpression());

        for(AbstractExpression abstractExpression : list){
            abstractExpression.interpret(context);
        }
    }
}
