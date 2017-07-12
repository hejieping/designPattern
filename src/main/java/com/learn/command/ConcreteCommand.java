package com.learn.command;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver){
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
