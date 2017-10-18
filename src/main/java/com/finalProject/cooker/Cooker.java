package com.finalProject.cooker;

import java.util.LinkedList;
import java.util.List;

import com.finalProject.HouseholdAppliances;

/**
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午8:50
 */
public class Cooker extends HouseholdAppliances implements Publisher{
    private List<Observer> observerList = new LinkedList<>();
    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifys() {
        for(Observer observer : observerList){
            observer.getNotify();
        }
    }
}
