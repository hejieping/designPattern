package com.finalProject.framework.cooker;

import java.util.LinkedList;
import java.util.List;

import com.finalProject.framework.HouseholdAppliancesTemplate;

/**
 * 电饭煲
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午8:50
 */
public class Cooker extends HouseholdAppliancesTemplate implements Publisher{
    private List<Observer> observerList = new LinkedList<>();

    /**
     * 添加电饭煲命令完成的消息通知者
     * @param observer
     */
    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 移除电饭煲命令完成的消息通知者
     * @param observer
     */
    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 命令完成，消息通知
     */
    @Override
    public void notifys() {
        for(Observer observer : observerList){
            observer.getNotify();
        }
    }

    /**
     * 煮粥
     */
    public void cookPorridge(){}

    /**
     * 煮饭
     */
    public void cookRice(){}

    /**
     * 煮汤
     */
    public void cookSoup(){}
}
