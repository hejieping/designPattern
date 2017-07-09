package com.learn.subscribe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class Subject {
    private List<Observer> observerlist = new ArrayList<Observer>();
    public void attach(Observer observer){
        observerlist.add(observer);
    }
    public void deach(Observer observer){
        observerlist.remove(observer);
    }
    public void notification(){
        for(Observer observer : observerlist){
            observer.update();
        }
    }
}
