package com.finalProject.framework.cooker;

/**
 * 煮粥命令
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/19 下午8:18
 */
public class PorridgeCommand extends Command {
    public PorridgeCommand(Cooker cooker){
        super(cooker);
    }
    @Override
    public void executeCommand() {
        super.getCooker().cookPorridge();
    }
}
