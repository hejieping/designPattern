package com.finalProject.framework.cooker;

/**
 * 煲汤命令
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/19 下午8:18
 */
public class SoupCommand extends Command {
    public SoupCommand(Cooker cooker){
        super(cooker);
    }
    @Override
    public void executeCommand() {

        super.getCooker().cookSoup();
        super.getCooker().notifys();
    }
}
