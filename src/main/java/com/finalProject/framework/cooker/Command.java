package com.finalProject.framework.cooker;

/**
 * 电饭煲执行的命令
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/19 下午8:17
 */
public abstract class Command {
    private Cooker cooker;
    public Command(Cooker cooker){
        this.cooker = cooker;
    }
    public abstract void executeCommand();
    public Cooker getCooker() {
        return cooker;
    }
    public void setCooker(Cooker cooker) {
        this.cooker = cooker;
    }
}
