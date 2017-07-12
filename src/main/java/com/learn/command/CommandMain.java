package com.learn.command;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class CommandMain {
    public static void main(String[] args){
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoke invoke = new Invoke();
        invoke.setCommand(command);
        invoke.executeCommand();

    }
}
