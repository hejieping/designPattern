package com.finalProject.framework.cooker;

import java.util.LinkedList;
import java.util.List;

import com.finalProject.applications.OutputsUtil;

/**
 * 电饭煲命令接受者，当接受到一定命令，通知电饭煲执行命令
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/19 下午8:19
 */
public class CookerInvoker {
    /**
     * 接受的命令
     */
    private List<Command> commandList = new LinkedList<>();

    public void setCommand(Command command){
        commandList.add(command);
    }


    public void cancleCommand(Command command){
        commandList.remove(command);
    }

    /**
     * 通知电饭煲执行命令
     */
    public void notifyCooker(){
        System.out.println(OutputsUtil.getOutput(this,"cookerInvoker","notifyCooker","notify cooker"));

        for(Command command : commandList){
            command.executeCommand();
        }
        commandList.clear();
    }
}
