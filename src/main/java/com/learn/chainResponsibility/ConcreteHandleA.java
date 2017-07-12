package com.learn.chainResponsibility;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class ConcreteHandleA extends Handle {
    @Override
    public void HandleRequest(int request) {
        if(request>0&&request<20){
            System.out.println("A agress with request"+request);
        }
        else
        {
            successor.HandleRequest(request);
        }
    }
}
