package com.learn.command;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public abstract class Command {
    protected Receiver receiver;
    public Command(Receiver receiver){
        this.receiver = receiver;
    }
    public abstract void execute();
}
