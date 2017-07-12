package com.learn.command;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class Invoke {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
