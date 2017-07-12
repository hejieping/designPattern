package com.learn.chainResponsibility;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class ConcreteHandleB extends Handle {
    @Override
    public void HandleRequest(int request) {
        if(request>=20&&request<30){
            System.out.println("B agress with request"+request);
        }
        else
        {
            successor.HandleRequest(request);
        }
    }
}
